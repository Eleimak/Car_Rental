package tam.group_bbv181.car_rental.services.car.interfaces;

import tam.group_bbv181.car_rental.model.Car;
import tam.group_bbv181.car_rental.model.TypeCar;

import java.util.List;

public interface ICarService {
    List<Car> getAll();

    Car create(Car car);
    Car get(String id);
    Car update(Car car);
    Car delete(String id);

    List<Car> getAllNoRepair();
    List<Car> getSortingByType(TypeCar typeCar);
    boolean uniqueNumber(String licenseNumberPlates);
}
