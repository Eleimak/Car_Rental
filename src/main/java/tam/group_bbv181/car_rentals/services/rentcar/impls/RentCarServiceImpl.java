package tam.group_bbv181.car_rentals.services.rentcar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.*;
import tam.group_bbv181.car_rentals.repository.*;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.rentcar.interfaces.IRentCarService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RentCarServiceImpl implements IRentCarService {
    @Autowired
    RentCarRepository rentCarRepository;

    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    CarServiceImpl carService;

//    @PostConstruct
//    void init(){
//
//        rentCarRepository.deleteAll();
//
//
//        rentCarRepository.saveAll( new ArrayList<>(
//                Arrays.asList(
//                        new RentCar(
//                        carService.getAll().get(3),
//                        customerService.getAll().get(0),
//                        LocalDate.of(2017, Month.JULY,15),
//                        LocalDate.of(2017,Month.AUGUST,16)
//                        ),
//                        new RentCar(
//                                carService.getAll().get(1),
//                                customerService.getAll().get(1),
//                                LocalDate.of(2018, Month.APRIL,26),
//                                LocalDate.of(2018,Month.MAY,1)
//                        ),
//                        new RentCar(
//                                carService.getAll().get(2),
//                                customerService.getAll().get(2),
//                                LocalDate.of(2018, Month.NOVEMBER,4),
//                                LocalDate.of(2018,Month.DECEMBER,19)
//                        )
//                        )));
//        Car car0 = carService.getAll().get(3);
//        car0.setRent(true);
//        carService.update(car0);
//        Car car1 = carService.getAll().get(1);
//        car1.setRent(true);
//        carService.update(car1);
//        Car car2 = carService.getAll().get(2);
//        car2.setRent(true);
//        carService.update(car2);
//        Customer customer0 = customerService.getAll().get(0);
//        customer0.setRent(true);
//        customerService.update(customer0);
//        Customer customer1 = customerService.getAll().get(1);
//        customer1.setRent(true);
//        customerService.update(customer1);
//        Customer customer2 = customerService.getAll().get(2);
//        customer2.setRent(true);
//        customerService.update(customer2);
//    }


    @Override
    public List<RentCar> getAll() {
        return rentCarRepository.findAll();
    }

    @Override
    public RentCar get(String id) {
        return (RentCar) rentCarRepository.findById(id).orElse(null);
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return (RentCar) rentCarRepository.save(rentCar);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return (RentCar) rentCarRepository.save(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        RentCar rentCar = this.get(id);
        rentCarRepository.deleteById(id);
        return rentCar;
    }

    @Override
    public void companyCarUpdate(CompanyCar companyCar) {
        List<RentCar> rentCarList = this.getAll();
        RentCar newRentCar = null;
        for (RentCar item : rentCarList) {
            if(item.getCar().hashCode() == companyCar.hashCode()){
                newRentCar = new RentCar(
                        companyCar,item.getCustomer(),item.getDateOfIssue(),
                  item.getReturnDate());
                newRentCar.setId(item.getId());
            }
        }
        rentCarRepository.save(newRentCar);
    }

    @Override
    public void customerUpdate(Customer customer) {
        List<RentCar> rentCarList = this.getAll();
        RentCar newRentCar = null;
        for (RentCar item : rentCarList) {
            if(item.getCustomer().hashCode() == customer.hashCode()){
                newRentCar = new RentCar(
                        item.getCar(),customer,item.getDateOfIssue(),
                        item.getReturnDate());
                newRentCar.setId(item.getId());
            }
        }
        rentCarRepository.save(newRentCar);
    }

}
