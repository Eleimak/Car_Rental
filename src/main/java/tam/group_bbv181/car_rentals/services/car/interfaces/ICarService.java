package tam.group_bbv181.car_rentals.services.car.interfaces;

import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;

import java.util.List;

public interface ICarService {
    List<Car> getAll();

    Car create(Car car);
    Car get(String id);
    Car update(Car car);
    Car delete(String id);

    List<Car> getAllNoRepair();
    List<Car> getSortingByType(TypeCar typeCar);
    boolean isUniqueNumber(String licenseNumberPlates);
    boolean isFullInput(CarForm carForm);
    List<Car> getSearchBrand(String search);
    List<Car> getSearchModel(String search);
    List<Car> getSearchLicenseNumberPlates(String search);
}
