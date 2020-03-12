package tam.group_bbv181.car_rentals.dao.car.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.car.interfaces.ICarDAO;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.repository.mongodb.CarMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CarDAOImpl implements ICarDAO {

    private final CarMongoRepository repository;

    public CarDAOImpl(CarMongoRepository carRepository) {
        this.repository = carRepository;
    }

    @Override
    public Car create(Car car) {
        return repository.save(car);
    }

    @Override
    public Car get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Car update(Car car) {
        return repository.save(car);
    }

    @Override
    public Car delete(String id) {
        Car car = this.get(id);
        repository.delete(car);
        return car;
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }
}
