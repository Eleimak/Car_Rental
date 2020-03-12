package tam.group_bbv181.car_rentals.repository.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rentals.model.Car;

@Repository
public interface CarMongoRepository extends MongoRepository<Car, String> {
}
