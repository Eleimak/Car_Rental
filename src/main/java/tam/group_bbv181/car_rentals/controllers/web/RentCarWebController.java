package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.RentCarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.RentCar;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;

import java.util.List;

@RequestMapping("/CarRentals/rentCar")
@CrossOrigin("*")
@Controller
public class RentCarWebController {
    @Autowired
    RentCarServiceImpl rentCarService;
    @Autowired
    CarServiceImpl carService;
    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping("/list")
    public String showAll(Model model){
        List<RentCar> list = rentCarService.getAll();
        model.addAttribute("RentCar", list);
        return "/rentcar/rentcarList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addCar(Model model){
        RentCarForm rentCarForm = new RentCarForm();
        List<Car> carList = carService.getAll();
        model.addAttribute("CarList", carList);
        List<Customer> customerList = customerService.getAll();
        model.addAttribute("CustomerList", customerList);
        model.addAttribute("RentCarForm", rentCarForm);
        return "/rentcar/rentcarAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model, @ModelAttribute("RentCarForm")
                         RentCarForm rentCarForm){
            RentCar newRentCar = new RentCar();

            rentCarService.create(newRentCar);
            return "redirect:/CarRentals/rentCar/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        rentCarService.delete(id);
        return "redirect:/CarRentals/rentCar/list";
    }
}
