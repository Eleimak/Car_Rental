package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;

import java.util.List;

@RequestMapping("/CarRentals/car")
@CrossOrigin("*")
@Controller
public class CarWebController {
    @Autowired
    CarServiceImpl carsService;

    @RequestMapping("/list")
    public String showAll(Model model){
        List<Car> list = carsService.getAll();
        model.addAttribute("cars", list);
        return "carList";
    }

    @RequestMapping("/listR")
    public String showNoRepair(Model model){
        List<Car> list = carsService.getAllNoRepair();
        model.addAttribute("cars", list);
        return "carList";
    }

    @RequestMapping("/listSort")
    public String showSort(Model model){
        List<Car> list = carsService.getSortingByType(TypeCar.SEDAN);
        model.addAttribute("cars", list);
        return "carList";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        carsService.delete(id);
        return "redirect:/CarRental/car/list";
    }
}
