package tam.group_bbv181.car_rentals.services.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.repository.CarRepository;
import tam.group_bbv181.car_rentals.services.car.interfaces.ICarService;

import java.util.List;

//@Service
public class CarServiceImpl implements ICarService {

    private CarRepository carRepository;

    //@Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
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
