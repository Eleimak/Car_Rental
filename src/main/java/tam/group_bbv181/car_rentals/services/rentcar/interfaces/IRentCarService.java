package tam.group_bbv181.car_rentals.services.rentcar.interfaces;

import sun.java2d.loops.CustomComponent;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.RentCar;

import java.util.List;

public interface IRentCarService {
    List<RentCar> getAll();
    RentCar get(String id);
    RentCar create(RentCar rentCar);
    RentCar update(RentCar rentCar);
    RentCar delete(String id);

    void carUpdate(Car car);
    void customerUpdate(Customer customer);
}
