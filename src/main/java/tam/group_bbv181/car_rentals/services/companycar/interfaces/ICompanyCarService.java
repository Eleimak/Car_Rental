package tam.group_bbv181.car_rentals.services.companycar.interfaces;

import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.model.TypeCar;

import java.util.List;

public interface ICompanyCarService {
    List<CompanyCar> getAll();

    CompanyCar create(CompanyCar companyCar);
    CompanyCar get(String id);
    CompanyCar update(CompanyCar companyCar);
    CompanyCar delete(String id);

    List<CompanyCar> getAllNoRepair();
    List<CompanyCar> getSortingByType(TypeCar typeCar);
    boolean isUniqueNumber(String licenseNumberPlates);
    boolean isFullInput(CarForm carForm);
    List<CompanyCar> getSearchBrand(String search);
    List<CompanyCar> getSearchModel(String search);
    List<CompanyCar> getSearchLicenseNumberPlates(String search);
}
