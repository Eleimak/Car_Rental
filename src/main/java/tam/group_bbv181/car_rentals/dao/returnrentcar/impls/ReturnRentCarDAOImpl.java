package tam.group_bbv181.car_rentals.dao.returnrentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.returnrentcar.interfaces.IReturnRentCarDAO;
import tam.group_bbv181.car_rentals.model.ReturnRentCar;
import tam.group_bbv181.car_rentals.repository.mongodb.ReturnRentCarMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class ReturnRentCarDAOImpl implements IReturnRentCarDAO {

    private final ReturnRentCarMongoRepository repository;

    public ReturnRentCarDAOImpl(ReturnRentCarMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ReturnRentCar create(ReturnRentCar returnRentCar) {
        return repository.save(returnRentCar);
    }

    @Override
    public ReturnRentCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ReturnRentCar update(ReturnRentCar returnRentCar) {
        return repository.save(returnRentCar);
    }

    @Override
    public ReturnRentCar delete(String id) {
        ReturnRentCar returnRentCar = this.get(id);
        repository.delete(returnRentCar);
        return returnRentCar;
    }

    @Override
    public List<ReturnRentCar> getAll() {
        return repository.findAll();
    }
}
