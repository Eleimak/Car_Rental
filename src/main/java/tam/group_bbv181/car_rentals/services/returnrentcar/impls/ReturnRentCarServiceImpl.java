package tam.group_bbv181.car_rentals.services.returnrentcar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.model.ReturnRentCar;
import tam.group_bbv181.car_rentals.repository.ReturnRentCarRepository;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;
import tam.group_bbv181.car_rentals.services.returnrentcar.interfaces.IReturnRentCarService;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ReturnRentCarServiceImpl implements IReturnRentCarService {
    @Autowired
    ReturnRentCarRepository returnRentCarRepository;
    @Autowired
    CarServiceImpl carService;
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    RentCarServiceImpl rentCarService;

    @PostConstruct
    void init() {
    returnRentCarRepository.deleteAll();
    }

    @Override
    public List<ReturnRentCar> getAll() {
        return returnRentCarRepository.findAll();
    }

    @Override
    public ReturnRentCar get(String id) {
        return returnRentCarRepository.findById(id).orElse(null);
    }

    @Override
    public ReturnRentCar create(ReturnRentCar returnRentCar) {
//        RentCar newRentCar = returnRentCar.getRentCar();
//        Car newCar = carService.get(newRentCar.getCar().getId());
//        newCar.setRent(false);
//        carService.update(newCar);
//        Customer newCustomer = customerService.get(newRentCar.getCustomer().getId());
//        newCustomer.setRent(false);
//        List<Car> carList = newCustomer.getCarList();
//        carList.add(newCar);
//        newCustomer.setCarList(carList);
//        newCustomer.setBonusPoints(newCustomer.getBonusPoints() + 1);
//        customerService.update(newCustomer);
//        rentCarService.delete(newRentCar.getId());
        return returnRentCarRepository.save(returnRentCar);
    }

    @Override
    public ReturnRentCar update(ReturnRentCar rentCar) {
        return returnRentCarRepository.save(rentCar);
    }

    @Override
    public ReturnRentCar delete(String id) {
        ReturnRentCar returnRentCar = this.get(id);
        returnRentCarRepository.deleteById(id);
        return returnRentCar;
    }
}
