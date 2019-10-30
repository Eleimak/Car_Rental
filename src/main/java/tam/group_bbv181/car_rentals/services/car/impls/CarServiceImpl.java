package tam.group_bbv181.car_rentals.services.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.repository.CarRepository;
import tam.group_bbv181.car_rentals.services.car.interfaces.ICarService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    CarRepository carRepository;

    @PostConstruct
    void init(){
        carRepository.deleteAll();

        List<Car> carList = new ArrayList<>();

        Car bmw = new Car("BMW", "320",25000,"AA",
                TypeCar.SEDAN, 2012,20,false);
        Car wolksvagen = new Car("Wolksvagen", "Polo",15000,"VV",
                TypeCar.HATCHBACK, 2015,15,false);
        Car mersedes = new Car("Mersedes", "E 220", 30000, "QQ",
                TypeCar.CONVERTIBLE, 2017,27,false);
        Car WV = new Car("Wolksvagen", "Lupo",25000,"AI",
                TypeCar.SEDAN, 2016,20,false);

        bmw.setRepair(true);

        carList.add(bmw);
        carList.add(wolksvagen);
        carList.add(mersedes);
        carList.add(WV);

        carRepository.saveAll(carList);
    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car get(String id) {
        return (Car) carRepository.findById(id).orElse(null);
    }

    @Override
    public Car create(Car car) {
        return (Car) carRepository.save(car);
    }

    @Override
    public Car update(Car car) {
        return (Car) carRepository.save(car);
    }

    @Override
    public Car delete(String id) {
        Car car = this.get(id);
        carRepository.deleteById(id);
        return car;
    }
    
    public List<Car> getAllNoRepair(){
        List<Car> carList = this.getAll();
        List<Car> carNoRepair = new ArrayList<>();
        for (Car item : carList) {
            if(!item.isRepair()){carNoRepair.add(item);}
        }
        return carNoRepair;
    }

    @Override
    public List<Car> getSortingByType(TypeCar typeCar) {
        List<Car> carList = this.getAll();
        List<Car> carTypeSort = new ArrayList<>();
        for (Car item : carList) {
            if(item.getTypeCar() == typeCar){carTypeSort.add(item);}
        }
        return carTypeSort;
    }


    @Override
    public boolean isUniqueNumber(String licenseNumberPlates) {
        List<Car> carList = this.getAll();
        for (Car item: carList) {
            if(item.getLicenseNumberPlates().equals(licenseNumberPlates)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isFullInput(CarForm carForm) {
        if(carForm.getBrandCar().equals("")){return false;}
        return true;
    }

    @Override
    public List<Car> getSearchBrand(String search) {
        return carRepository.findCarByBrandCar(search);
    }

    @Override
    public List<Car> getSearchModel(String search) {
        return carRepository.findCarByModelCar(search);
    }

    @Override
    public List<Car> getSearchLicenseNumberPlates(String search) {
        return carRepository.findCarByLicenseNumberPlates(search);
    }

    @Override
    public List<Car> getSearchCostCarBetween(Integer from, Integer before) {
        return carRepository.findCarByCostCarIsBetween(from, before);
    }
}
