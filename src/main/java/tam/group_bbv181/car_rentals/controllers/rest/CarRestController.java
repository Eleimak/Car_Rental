package tam.group_bbv181.car_rentals.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/car")
public class CarRestController {
    @Autowired
    CarServiceImpl carService;

    @RequestMapping("/get/list")
    List<Car> showAll(){
        return carService.getAll();
    }
}
