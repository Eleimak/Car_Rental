package tam.group_bbv181.car_rental.services.cars.interfaces;

import tam.group_bbv181.car_rental.model.Car;

import java.util.List;

public interface ICarsService {
    List<Car> getAll();
    Car get(String id);
    Car create(Car car);
    Car update(Car car);
    Car delete(String id);
}
