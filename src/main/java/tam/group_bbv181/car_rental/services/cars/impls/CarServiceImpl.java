package tam.group_bbv181.car_rental.services.cars.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rental.model.Car;
import tam.group_bbv181.car_rental.model.Type;
import tam.group_bbv181.car_rental.repository.CarRepository;
import tam.group_bbv181.car_rental.services.cars.interfaces.ICarsService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements ICarsService {
    @Autowired
    CarRepository carRepository;

    List<Car> carList = new ArrayList<>();

    @PostConstruct
    void init(){
        carRepository.deleteAll();
        Car bmw = new Car("BMW",25000,"AA","good", Type.SEDAN,
                LocalDate.of(2012, Month.APRIL, 25),20);
        Car wolksvagen = new Car("Wolksvagen",15000,"VV", "nice",
                Type.HATCHBACK, LocalDate.of(2015,Month.AUGUST,12),15);
        Car mersedes = new Car("Mersedes", 30000, "QQ", "good",
                Type.CONVERTIBLE, LocalDate.of(2017,Month.FEBRUARY,6),27);
        carList.add(bmw);
        carList.add(wolksvagen);
        carList.add(mersedes);
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
}
