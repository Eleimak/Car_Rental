package tam.group_bbv181.car_rentals.services.returnrentcar.interfaces;

import tam.group_bbv181.car_rentals.model.ReturnRentCar;

import java.util.List;

public interface IReturnRentCarService {
    List<ReturnRentCar> getAll();
    ReturnRentCar get(String id);
    ReturnRentCar create(ReturnRentCar rentCar);
    ReturnRentCar update(ReturnRentCar rentCar);
    ReturnRentCar delete(String id);
}
