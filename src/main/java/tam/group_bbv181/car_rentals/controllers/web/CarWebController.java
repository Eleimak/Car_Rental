package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.CarForm;
import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.TypeCar;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;

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
    @Autowired
    RentCarServiceImpl rentCarService;

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
        List<Car> listFull = carService.getAll();
        model.addAttribute("cars", listFull);
        return "/car/carListSearch1";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addCar(Model model){
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
                    carForm.getRentalPrice(), false,false);
            carService.create(newCar);
            return "redirect:/CarRentals/car/list";
        }
        List typeCar = Arrays.asList( TypeCar.values());
        model.addAttribute("typeCar", typeCar);
        List yearCar = new ArrayList();
        int nowYear = LocalDate.now().getYear();
        for (Integer i = nowYear; i >= 2000; i--) {
            yearCar.add(i.toString());
        }
        model.addAttribute("yearCar", yearCar);
        String error = "All fields must be filled!";
        model.addAttribute("errorMessage", error);
        return "/car/carAdd";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        carService.delete(id);
        return "redirect:/CarRentals/car/list";
    }

    // @PostMapping("/update/{id}")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCar(Model model,  @PathVariable("id") String id){
        Car carToUpdate = carService.get(id);
        CarForm carForm = new CarForm();
        carForm.setId(carToUpdate.getId());
        carForm.setBrandCar(carToUpdate.getBrandCar());
        carForm.setModelCar(carToUpdate.getModelCar());
        carForm.setCostCar(carToUpdate.getCostCar());
        carForm.setLicenseNumberPlates(carToUpdate.getLicenseNumberPlates());
        carForm.setTypeCar(carToUpdate.getTypeCar());
        carForm.setYearCar(carToUpdate.getYearCar());
        carForm.setRentalPrice(carToUpdate.getRentalPrice());
        List listRepair = new ArrayList();
        if(carToUpdate.isRepair()){
            listRepair.add("yes");
            listRepair.add("no");
        }
        else{
            listRepair.add("no");
            listRepair.add("yes");
        }
        model.addAttribute("ListRepair", listRepair);
        String rent;
        if(carToUpdate.isRent()){
            rent = "yes";
        }
        else{
            rent = "no";
        }
        carForm.setRent(rent);
        model.addAttribute("CarForm", carForm);
        return "/car/carToUpdate";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("CarForm") CarForm carForm){
        boolean repair, rent;
        if(carForm.getRepair().equals("yes")){
            repair = true;
        }else{
            repair = false;
        }
        if(carForm.getRent().equals("yes")){
            rent = true;
        }
        else {
            rent = false;
        }
        Car newCar = new Car(carForm.getBrandCar(), carForm.getModelCar(),
                carForm.getCostCar(), carForm.getLicenseNumberPlates(),
                carForm.getTypeCar(), carForm.getYearCar(),
                carForm.getRentalPrice(), repair, rent);
        newCar.setId(carForm.getId());

        rentCarService.carUpdate(carService.update(newCar));
        return "redirect:/CarRentals/car/list";
    }
}
