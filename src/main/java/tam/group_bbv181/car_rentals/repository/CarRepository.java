package tam.group_bbv181.car_rentals.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rentals.model.Car;

import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
}
