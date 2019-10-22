package tam.group_bbv181.car_rentals.services.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.repository.CarRepository;
import tam.group_bbv181.car_rentals.services.car.interfaces.ICarService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    CarRepository carRepository;

    @PostConstruct
    void init(){
        carRepository.deleteAll();

        List<Car> carList = new ArrayList<>();

        Car bmw = new Car("BMW",25000,"AA","good",
                TypeCar.SEDAN, LocalDate.of(2012, Month.APRIL, 25),20);
        Car wolksvagen = new Car("Wolksvagen",15000,"VV", "nice",
                TypeCar.HATCHBACK, LocalDate.of(2015,Month.AUGUST,12),15);
        Car mersedes = new Car("Mersedes", 30000, "QQ", "good",
                TypeCar.CONVERTIBLE, LocalDate.of(2017,Month.FEBRUARY,6),27);
        Car WV = new Car("Wolksvagen",25000,"AI","good",
                TypeCar.SEDAN, LocalDate.of(2016, Month.MARCH, 5),20);

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
    public boolean uniqueNumber(String licenseNumberPlates) {
        List<Car> carList = this.getAll();
        for (Car item: carList) {
            if(item.getLicenseNumberPlates().equals(licenseNumberPlates)){
                return false;
            }
        }
        return true;
    }
}
