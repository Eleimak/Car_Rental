package tam.group_bbv181.car_rentals.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.model.ReturnRentCar;
import tam.group_bbv181.car_rentals.service.returnrentcar.impls.ReturnRentCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/return")
public class ReturnRentCarRestController {

    ReturnRentCarServiceImpl service;

    @Autowired
    public ReturnRentCarRestController(ReturnRentCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<ReturnRentCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ReturnRentCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public ReturnRentCar create(@RequestBody ReturnRentCar returnRentCar){
        return service.create(returnRentCar);
    }

    @PutMapping("/update")
    public ReturnRentCar update(@RequestBody ReturnRentCar returnRentCar){
        return service.create(returnRentCar);
    }
}
