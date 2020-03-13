package tam.group_bbv181.car_rentals.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.model.CompanyCar;
import tam.group_bbv181.car_rentals.services.companycar.impls.CompanyCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/company")
public class CompanyCarRestController {

    CompanyCarServiceImpl service;

    @Autowired
    public CompanyCarRestController(CompanyCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    List<CompanyCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public CompanyCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public CompanyCar create(@RequestBody CompanyCar companyCar){
        return service.create(companyCar);
    }

    @PutMapping("/update")
    public CompanyCar update(@RequestBody CompanyCar companyCar){
        return service.create(companyCar);
    }

    @GetMapping("/get/{id}")
    public CompanyCar get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
