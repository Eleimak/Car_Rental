package tam.group_bbv181.car_rentals.services.companycar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.repository.CarRepository;
import tam.group_bbv181.car_rentals.repository.CompanyCarRepository;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.companycar.interfaces.ICompanyCarService;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyCarServiceImpl implements ICompanyCarService {
    @Autowired
    CompanyCarRepository companyCarRepository;
    @Autowired
    CarRepository carRepository;

    CarServiceImpl carService;

    List<CompanyCar> companyCarList = new ArrayList<>();

    @PostConstruct
    void init(){
        carRepository.deleteAll();
        companyCarRepository.deleteAll();

        List<Car> carList = new ArrayList<>();

        Car bmw = new Car("BMW", "320",
                TypeCar.SEDAN,  210000,true, "2012",4,"Petrol");
        Car volkswagen = new Car("Volkswagen", "Polo",
                TypeCar.HATCHBACK,180000, true, "2015",5,"Diesel");
        Car mercedes = new Car("Mercedes", "E 220",
                TypeCar.CONVERTIBLE, 65000, false, "2017", 4, "Mixed");
        Car WV = new Car("Volkswagen", "Lupo",
                TypeCar.SEDAN,50000,false, "2016", 4, "Diesel");
        Car Fiat = new Car("Fiat", "Uno",
                TypeCar.SEDAN,500000,false, "2018", 3, "Diesel");
        Car audi = new Car("Audi", "e-tron",
                TypeCar.SEDAN,500000,false, "2018", 3, "Diesel");


        carList.add(bmw);
        carList.add(volkswagen);
        carList.add(mercedes);
        carList.add(WV);
        carList.add(Fiat);

        carRepository.saveAll(carList);



        CompanyCar bMw = new CompanyCar(bmw,"white",25000,"AA",20);
        CompanyCar volksWagen = new CompanyCar(volkswagen, "black",15000,"VV",15);
        CompanyCar merCedes = new CompanyCar(mercedes, "blue",30000,"QQ",27);
        CompanyCar wV = new CompanyCar(WV, "cyan", 25000,"RR",20);
        CompanyCar fiat = new CompanyCar(Fiat, "blue", 22000,"IR",22);

        bMw.setRepair(true);

        companyCarList.add(bMw);
        companyCarList.add(volksWagen);
        companyCarList.add(merCedes);
        companyCarList.add(wV);
        companyCarList.add(fiat);

        companyCarRepository.saveAll(companyCarList);
    }


    @Override
    public List<CompanyCar> getAll() {
        return this.companyCarRepository.findAll();
    }

    @Override
    public CompanyCar create(CompanyCar companyCar) {
        return companyCarRepository.save(companyCar);
    }

    @Override
    public CompanyCar get(String id) {
        return companyCarRepository.findById(id).orElse(null);
    }

    @Override
    public CompanyCar update(CompanyCar companyCar) {
        return companyCarRepository.save(companyCar);
    }

    @Override
    public CompanyCar delete(String id) {
        CompanyCar companyCar = this.get(id);
        companyCarRepository.deleteById(id);
        carService.delete(companyCar.getCar().getId());
        return companyCar;
    }

    public List<CompanyCar> getAllNoRepair(){
        List<CompanyCar> carList = this.getAll();
        List<CompanyCar> carNoRepair = new ArrayList<>();
        for (CompanyCar item : carList) {
            if(!item.isRepair()){carNoRepair.add(item);}
        }
        return carNoRepair;
    }

    @Override
    public List<CompanyCar> getSortingByType(TypeCar typeCar) {
        List<CompanyCar> carList = this.getAll();
        List<CompanyCar> carTypeSort = new ArrayList<>();
        for (CompanyCar item : carList) {
            if(item.getCar().getTypeCar() == typeCar){carTypeSort.add(item);}
        }
        return carTypeSort;
    }

    @Override
    public boolean isUniqueNumber(String licenseNumberPlates) {
        List<CompanyCar> carList = this.getAll();
        for (CompanyCar item: carList) {
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
    public List<CompanyCar> getSearchBrand(String search) {
        return companyCarRepository.findCompanyCarByCar_BrandCar(search);
    }

    @Override
    public List<CompanyCar> getSearchModel(String search) {
        return companyCarRepository.findCompanyCarByCar_ModelCar(search);
    }

    @Override
    public List<CompanyCar> getSearchLicenseNumberPlates(String search) {
        return companyCarRepository.findCompanyCarByLicenseNumberPlates(search);
    }
}
