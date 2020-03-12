package tam.group_bbv181.car_rentals.service.companycar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.companycar.interfaces.ICompanyCarDAO;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.service.companycar.interfaces.ICompanyCarService;

import java.util.List;

@Service
public class CompanyCarServiceImpl implements ICompanyCarService {

    private final ICompanyCarDAO iCompanyCarDAO;

    public CompanyCarServiceImpl(@Qualifier("mongodb") ICompanyCarDAO iCompanyCarDAO) {
        this.iCompanyCarDAO = iCompanyCarDAO;
    }

    @Override
    public CompanyCar create(CompanyCar companyCar) {
        return iCompanyCarDAO.create(companyCar);
    }

    @Override
    public CompanyCar get(String id) {
        return iCompanyCarDAO.get(id);
    }

    @Override
    public CompanyCar update(CompanyCar companyCar) {
        return iCompanyCarDAO.update(companyCar);
    }

    @Override
    public CompanyCar delete(String id) {
        return iCompanyCarDAO.delete(id);
    }

    @Override
    public List<CompanyCar> getAll() {
        return iCompanyCarDAO.getAll();
    }
}
