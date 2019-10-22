package tam.group_bbv181.car_rental.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tam.group_bbv181.car_rental.model.Car;
import tam.group_bbv181.car_rental.services.cars.impls.CarServiceImpl;

import java.util.List;

@RequestMapping("/CarRentals/cars")
@CrossOrigin("*")
@Controller
public class CarWebController {
    @Autowired
    CarServiceImpl carsService;

    @RequestMapping("/list")
    public String showAll(Model model){
        List<Car> list = carsService.getAll();
        model.addAttribute("cars", list);
        return "carsList";
    }


    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        carsService.delete(id);
        List<Car> list = carsService.getAll();
        return "/CarRentals/cars/list";
    }
}
