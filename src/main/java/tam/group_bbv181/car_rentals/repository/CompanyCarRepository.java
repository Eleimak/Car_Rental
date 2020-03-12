package tam.group_bbv181.car_rentals.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rentals.model.CompanyCar;

import java.util.List;

@Repository
public interface CompanyCarRepository extends MongoRepository<CompanyCar, String> {
    List<CompanyCar> findCompanyCarByCar_BrandCar(String search);
    List<CompanyCar> findCompanyCarByCar_ModelCar(String search);
    List<CompanyCar> findCompanyCarByLicenseNumberPlates(String search);
}
