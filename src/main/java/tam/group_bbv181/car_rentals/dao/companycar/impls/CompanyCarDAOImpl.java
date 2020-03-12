package tam.group_bbv181.car_rentals.dao.companycar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.companycar.interfaces.ICompanyCarDAO;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.repository.mongodb.CompanyCarMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CompanyCarDAOImpl implements ICompanyCarDAO {

    private final CompanyCarMongoRepository repository;

    public CompanyCarDAOImpl(CompanyCarMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompanyCar create(CompanyCar companyCar) {
        return repository.save(companyCar);
    }

    @Override
    public CompanyCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CompanyCar update(CompanyCar companyCar) {
        return repository.save(companyCar);
    }

    @Override
    public CompanyCar delete(String id) {
        CompanyCar companyCar = this.get(id);
        repository.delete(companyCar);
        return companyCar;
    }

    @Override
    public List<CompanyCar> getAll() {
        return repository.findAll();
    }
}
