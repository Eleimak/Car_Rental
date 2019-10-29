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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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

    @RequestMapping(value = "/listR", method = RequestMethod.GET)
    public String showNoRepair(Model model, @ModelAttribute("CarForm")
            CarForm carForm){
        List<Car> list = carsService.getAll();
        List typeCar = Arrays.asList(
                TypeCar.CONVERTIBLE
                ,TypeCar.COUPE
                ,TypeCar.HATCHBACK
                ,TypeCar.MUV_SUV
                ,TypeCar.PIC_UP_VEHICLE
                ,TypeCar.SEDAN
                ,TypeCar.VAN
                ,TypeCar.WAGON
        );
        model.addAttribute("typeCar", typeCar);
        List<Car> listNoRepair = carsService.getAllNoRepair();
        List<Car> listSortingByType = carsService.getSortingByType(carForm.getTypeCar());
        model.addAttribute("cars", list);
        return "carList";
    }
    @RequestMapping(value = "/listR", method = RequestMethod.POST)
    public String showFull(Model model,@ModelAttribute("CarForm")
            CarForm carForm){

        return "carList";
    }

    @RequestMapping("/listSort")
    public String showSort(Model model){
        List<Car> list = carsService.getSortingByType(TypeCar.SEDAN);
        model.addAttribute("cars", list);
        return "carList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addCar(Model model){
        List<Car> list = carsService.getAll();
        CarForm carForm = new CarForm();
        List typeCar = Arrays.asList(
                TypeCar.CONVERTIBLE
                ,TypeCar.COUPE
                ,TypeCar.HATCHBACK
                ,TypeCar.MUV_SUV
                ,TypeCar.PIC_UP_VEHICLE
                ,TypeCar.SEDAN
                ,TypeCar.VAN
                ,TypeCar.WAGON
        );
        model.addAttribute("typeCar", typeCar);
        model.addAttribute("CarForm", carForm);
        return "carAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model,@ModelAttribute("CarForm")
            CarForm carForm){
        if(carsService.isUniqueNumber(carForm.getLicenseNumberPlates()) &&
                carsService.isFullInput(carForm)){
            Car newCar = new Car(carForm.getBrandCar(),carForm.getModelCar(),
                    carForm.getCostCar(), carForm.getLicenseNumberPlates(),
                    carForm.getTypeCar(), carForm.getCarYear(),
                    carForm.getRentalPrice(), carForm.isRepair());
            carsService.create(newCar);
            return "redirect:/CarRentals/car/list";
        }
        return "redirect:/CarRentals/car/create";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        carsService.delete(id);
        return "redirect:/CarRentals/car/list";
    }
}
