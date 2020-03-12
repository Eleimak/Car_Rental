package tam.group_bbv181.car_rentals.service.returnrentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.returnrentcar.interfaces.IReturnRentCarDAO;
import tam.group_bbv181.car_rentals.model.ReturnRentCar;
import tam.group_bbv181.car_rentals.service.returnrentcar.interfaces.IReturnRentCarService;

import java.util.List;

@Service
public class ReturnRentCarServiceImpl implements IReturnRentCarService {

    private final IReturnRentCarDAO iReturnRentCarDAO;

    public ReturnRentCarServiceImpl(@Qualifier("mongodb") IReturnRentCarDAO iReturnRentCarDAO) {
        this.iReturnRentCarDAO = iReturnRentCarDAO;
    }

    @Override
    public ReturnRentCar create(ReturnRentCar returnRentCar) {
        return iReturnRentCarDAO.create(returnRentCar);
    }

    @Override
    public ReturnRentCar get(String id) {
        return iReturnRentCarDAO.get(id);
    }

    @Override
    public ReturnRentCar update(ReturnRentCar returnRentCar) {
        return iReturnRentCarDAO.update(returnRentCar);
    }

    @Override
    public ReturnRentCar delete(String id) {
        return iReturnRentCarDAO.delete(id);
    }

    @Override
    public List<ReturnRentCar> getAll() {
        return iReturnRentCarDAO.getAll();
    }
}
