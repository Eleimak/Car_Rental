package tam.group_bbv181.car_rental.services.rentcar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rental.model.RentCar;
import tam.group_bbv181.car_rental.repository.CarRepository;
import tam.group_bbv181.car_rental.repository.CustomerRepository;
import tam.group_bbv181.car_rental.repository.RentCarRepository;
import tam.group_bbv181.car_rental.services.rentcar.interfaces.IRentCarService;

import java.util.List;

@Service
public class RentCarServiceImpl implements IRentCarService {
    @Autowired
    RentCarRepository rentCarRepository;
    CarRepository carRepository;
    CustomerRepository customerRepository;

    @Override
    public List<RentCar> getAll() {
        return rentCarRepository.findAll();
    }

    @Override
    public RentCar get(String id) {
        return (RentCar) rentCarRepository.findById(id).orElse(null);
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return (RentCar) rentCarRepository.save(rentCar);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return (RentCar) rentCarRepository.save(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        RentCar rentCar = this.get(id);
        rentCarRepository.deleteById(id);
        return rentCar;
    }
}
