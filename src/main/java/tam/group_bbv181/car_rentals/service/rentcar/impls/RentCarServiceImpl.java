package tam.group_bbv181.car_rentals.service.rentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.rentcar.interfaces.IRentCarDAO;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.service.rentcar.interfaces.IRentCarService;

import java.util.List;

@Service
public class RentCarServiceImpl implements IRentCarService {

    private final IRentCarDAO iRentCarDAO;

    public RentCarServiceImpl(@Qualifier("mongodb") IRentCarDAO iRentCarDAO) {
        this.iRentCarDAO = iRentCarDAO;
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return iRentCarDAO.create(rentCar);
    }

    @Override
    public RentCar get(String id) {
        return iRentCarDAO.get(id);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return iRentCarDAO.update(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        return iRentCarDAO.delete(id);
    }

    @Override
    public List<RentCar> getAll() {
        return iRentCarDAO.getAll();
    }
}
