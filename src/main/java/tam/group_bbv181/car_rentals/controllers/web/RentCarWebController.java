package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.RentCarForm;
import tam.group_bbv181.car_rentals.model.*;
import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;
import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/list")
    public String showAll(Model model){
        List<RentCar> list = rentCarService.getAll();

        ///////////////////////////////////////////////////////////////
        boolean isAuthenticated;
        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
        else isAuthenticated = false;
        if(isAuthenticated){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
            Person personLogin = personService.getPersonLoginUser(loginUser);
            Customer customerLogin = customerService.getCustomerPerson(personLogin);
            model.addAttribute("personLogin", customerLogin);
        }
        model.addAttribute("isAuthenticated", isAuthenticated);
        /////////////////////////////////////////////////////////////////

        model.addAttribute("RentCar", list);
        return "/rentcar/rentcarList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addCar(Model model){
        RentCarForm rentCarForm = new RentCarForm();

        List<Car> carList = carService.getAll();
        Map<String, String> mapCarList = new HashMap<>();
        String carBrand;
        for (Car item : carList) {
            carBrand = item.getBrandCar()+" "+item.getModelCar()+" "+item.getLicenseNumberPlates();
            mapCarList.put(item.getId(),carBrand);
        }
        model.addAttribute("CarList", mapCarList);

        List<Customer> customerList = customerService.getAll();
        Map<String, String> mapCustomerList = new HashMap<>();
        String fullName;
        for (Customer item : customerList) {
            fullName = item.getPerson().getFirstName()+" "+item.getPerson().getLastName()+" "+item.getPerson().getMiddleName();
            mapCustomerList.put(item.getId(),fullName);
        }
        model.addAttribute("CustomerList", mapCustomerList);

        model.addAttribute("RentCarForm", rentCarForm);

        /////////////////////////////////////////////////////////////////
        boolean isAuthenticated;
        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
        else isAuthenticated = false;
        if(isAuthenticated){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
            Person personLogin = personService.getPersonLoginUser(loginUser);
            Customer customerLogin = customerService.getCustomerPerson(personLogin);
            model.addAttribute("personLogin", customerLogin);
        }
        model.addAttribute("isAuthenticated", isAuthenticated);
        ////////////////////////////////////////////////////////////////

        return "/rentcar/rentcarAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model, @ModelAttribute("RentCarForm")
                         RentCarForm rentCarForm){
            RentCar newRentCar = new RentCar();
            newRentCar.setCar(carService.get(rentCarForm.getCarID()));
            newRentCar.setCustomer(customerService.get(rentCarForm.getCustomerID()));
            newRentCar.setDateOfIssue(LocalDate.parse(rentCarForm.getDateOfIssue(),
                    DateTimeFormatter.ofPattern("MM/dd/yyyy")));
            newRentCar.setReturnDate(LocalDate.parse(rentCarForm.getReturnDate(),
                    DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(rentCarService.create(newRentCar));
        return "redirect:/CarRentals/rentCar/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCustomer(Model model,  @PathVariable("id") String id){

        RentCar rentCarToUpdate = rentCarService.get(id);

        RentCarForm rentCarForm = new RentCarForm();

        rentCarForm.setId(rentCarToUpdate.getId());
        LocalDate date = rentCarToUpdate.getDateOfIssue();
        String dateString = date.getMonth() + "/" + date.getDayOfMonth() + "/" + date.getYear();
        rentCarForm.setDateOfIssue(dateString);
        date = rentCarToUpdate.getReturnDate();
        dateString = date.getMonth() + "/" + date.getDayOfMonth() + "/" + date.getYear();
        rentCarForm.setReturnDate(dateString);

        rentCarForm.setCarID(rentCarToUpdate.getCar().getId());
        rentCarForm.setCarBrand(rentCarToUpdate.getCar().getBrandCar());
        rentCarForm.setCarModel(rentCarToUpdate.getCar().getModelCar());
        rentCarForm.setCarNumber(rentCarToUpdate.getCar().getLicenseNumberPlates());

        rentCarForm.setCustomerID(rentCarToUpdate.getCustomer().getId());
        rentCarForm.setCustomerFirstName(rentCarToUpdate.getCustomer().getPerson().getFirstName());
        rentCarForm.setCustomerLastName(rentCarToUpdate.getCustomer().getPerson().getLastName());
        rentCarForm.setCustomerMiddleName(rentCarToUpdate.getCustomer().getPerson().getMiddleName());

        model.addAttribute("RentCarForm", rentCarForm);

        ////////////////////////////////////////////////////////////
        boolean isAuthenticated;
        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
        else isAuthenticated = false;
        if(isAuthenticated){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
            Person personLogin = personService.getPersonLoginUser(loginUser);
            Customer customerLogin = customerService.getCustomerPerson(personLogin);
            model.addAttribute("personLogin", customerLogin);
        }
        model.addAttribute("isAuthenticated", isAuthenticated);
        /////////////////////////////////////////////////////////////

        return "/rentcar/rentCarToUpdate";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable("id") String id,
                         @ModelAttribute("RentCarForm") RentCarForm rentCarForm){

        RentCar newRentCar = rentCarService.get(id);
        newRentCar.setReturnDate(LocalDate.parse(rentCarForm.getReturnDate(),
                DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        rentCarService.update(newRentCar);
        return "redirect:/CarRentals/rentCar/list";
    }
    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        rentCarService.delete(id);

        //////////////////////////////////////////////////////////////
        boolean isAuthenticated;
        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
        else isAuthenticated = false;
        if(isAuthenticated){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
            Person personLogin = personService.getPersonLoginUser(loginUser);
            Customer customerLogin = customerService.getCustomerPerson(personLogin);
            model.addAttribute("personLogin", customerLogin);
        }
        model.addAttribute("isAuthenticated", isAuthenticated);
        //////////////////////////////////////////////////////////////

        return "redirect:/CarRentals/rentCar/list";
    }
}
