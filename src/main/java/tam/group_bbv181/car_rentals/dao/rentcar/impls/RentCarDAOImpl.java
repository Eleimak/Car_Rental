package tam.group_bbv181.car_rentals.dao.rentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.rentcar.interfaces.IRentCarDAO;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.repository.mongodb.RentCarMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class RentCarDAOImpl implements IRentCarDAO {

    private final RentCarMongoRepository repository;

    public RentCarDAOImpl(RentCarMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return repository.save(rentCar);
    }

    @Override
    public RentCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return repository.save(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        RentCar rentCar = this.get(id);
        repository.delete(rentCar);
        return rentCar;
    }

    @Override
    public List<RentCar> getAll() {
        return repository.findAll();
    }
}
