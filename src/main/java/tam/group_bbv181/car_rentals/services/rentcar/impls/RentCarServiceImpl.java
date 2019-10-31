package tam.group_bbv181.car_rentals.services.rentcar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.repository.CarRepository;
import tam.group_bbv181.car_rentals.repository.CustomerRepository;
import tam.group_bbv181.car_rentals.repository.RentCarRepository;
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
/*
    @PostConstruct
    void init(){
        rentCarRepository.deleteAll();
        rentCarRepository.saveAll(new ArrayList<>(
                Arrays.asList(
                        new RentCar(
                                carService.getAll().get(0),
                                customerService.getAll().get(0),
                                LocalDate.of(15, Month.JULY,2017),
                                LocalDate.of(16,Month.AUGUST,2017)
                        ),
                        new RentCar(
                                carService.getAll().get(1),
                                customerService.getAll().get(1),
                                LocalDate.of(26, Month.APRIL,2018),
                                LocalDate.of(1,Month.MAY,2018)
                        ),
                        new RentCar(
                                carService.getAll().get(2),
                                customerService.getAll().get(2),
                                LocalDate.of(4, Month.NOVEMBER,2018),
                                LocalDate.of(19,Month.DECEMBER,2018)
                        ),
                        new RentCar(
                                carService.getAll().get(3),
                                customerService.getAll().get(3),
                                LocalDate.of(20, Month.JANUARY,2019),
                                LocalDate.of(29,Month.MARCH,2019)
                        )

                )
        ));

    }
*/

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
}
