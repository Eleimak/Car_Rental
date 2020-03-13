package tam.group_bbv181.car_rentals.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.service.rentcar.impls.RentCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/rentcar")
public class RentCarRestController {

    RentCarServiceImpl service;

    @Autowired
    public RentCarRestController(RentCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<RentCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public RentCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public RentCar create(@RequestBody RentCar rentCar){
        return service.create(rentCar);
    }

    @PutMapping("/update")
    public RentCar update(@RequestBody RentCar rentCar){
        return service.create(rentCar);
    }

    @GetMapping("/get/{id}")
    public RentCar get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
