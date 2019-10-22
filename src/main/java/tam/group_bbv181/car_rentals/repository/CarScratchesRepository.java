package tam.group_bbv181.car_rentals.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rentals.model.CarScratches;

@Repository
public interface CarScratchesRepository extends MongoRepository<CarScratches, String> {
}
