package tam.group_bbv181.car_rentals.service.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.car.interfaces.ICarDAO;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.service.car.interfaces.ICarService;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    private final ICarDAO iCarDAO;

    @Autowired
    public CarServiceImpl(@Qualifier("mongodb") ICarDAO iCarDAO) {
        this.iCarDAO = iCarDAO;
    }

    @Override
    public Car create(Car car) {
        return iCarDAO.create(car);
    }

    @Override
    public Car get(String id) {
        return iCarDAO.get(id);
    }

    @Override
    public Car update(Car car) {
        return iCarDAO.update(car);
    }

    @Override
    public Car delete(String id) {
        return iCarDAO.delete(id);
    }

    @Override
    public List<Car> getAll() {
        return iCarDAO.getAll();
    }
}
