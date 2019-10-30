package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/CarRentals/car")
@CrossOrigin("*")
@Controller
public class CarWebController {
    @Autowired
    CarServiceImpl carService;

    @RequestMapping("/list")
    public String showAll(Model model){
        List<Car> list = carService.getAll();
        model.addAttribute("cars", list);
        return "/car/carList";
    }

    @RequestMapping("/listR")
    public String showNoRepair(Model model){
        List<Car> listNoRepair = carService.getAllNoRepair();
        model.addAttribute("cars", listNoRepair);
        return "/car/carList";
    }

    @RequestMapping("/listSort")
    public String showSort(Model model){
        List<Car> list = carService.getSortingByType(TypeCar.SEDAN);
        model.addAttribute("cars", list);
        return "/car/carList";
    }
    @RequestMapping("/listSearch")
    public String showSearch(Model model){
        List<Car> list = new ArrayList<>();
        list.addAll(carService.getSearchBrand("BMW"));
        list.addAll(carService.getSearchModel("Polo"));
        list.addAll(carService.getSearchLicenseNumberPlates("Qq"));
        list.addAll(carService.getSearchCostCarBetween(15000, 25000));
        model.addAttribute("cars", list);
        return "/car/carList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addCar(Model model){
        List<Car> list = carService.getAll();
        CarForm carForm = new CarForm();
        List typeCar = Arrays.asList( TypeCar.values());
        model.addAttribute("typeCar", typeCar);
        List yearCar = new ArrayList();
        int nowYear = LocalDate.now().getYear();
        for (Integer i = nowYear; i >= 2000; i--) {
            yearCar.add(i.toString());
        }
        model.addAttribute("yearCar", yearCar);
        model.addAttribute("CarForm", carForm);
        return "/car/carAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model,@ModelAttribute("CarForm")
            CarForm carForm){
        if(carService.isUniqueNumber(carForm.getLicenseNumberPlates()) &&
                carService.isFullInput(carForm)){
            Car newCar = new Car(carForm.getBrandCar(),carForm.getModelCar(),
                    carForm.getCostCar(), carForm.getLicenseNumberPlates(),
                    carForm.getTypeCar(), carForm.getYearCar(),
                    carForm.getRentalPrice(), carForm.isRepair());
            carService.create(newCar);
            return "redirect:/CarRentals/car/list";
        }
        return "redirect:/CarRentals/car/create";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        carService.delete(id);
        return "redirect:/CarRentals/car/list";
    }
}
