package tam.group_bbv181.car_rentals.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.services.companycar.impls.CompanyCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/company")
public class CompanyCarRestController {
    @Autowired
    CompanyCarServiceImpl companyCarService;

    @RequestMapping("/get/list")
    List<CompanyCar> showAll(){
        return companyCarService.getAll();
    }
}
