//package tam.group_bbv181.car_rentals.controllers.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import tam.group_bbv181.car_rentals.forms.RentCarForm;
//import tam.group_bbv181.car_rentals.model.*;
//import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
//import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
//import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;
//import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;
//import tam.group_bbv181.car_rentals.services.returnrentcar.impls.ReturnRentCarServiceImpl;
//
//import java.time.Duration;
//import java.time.LocalDate;
//import java.util.List;
//
//@RequestMapping("/CarRentals/returnRentCar")
//@CrossOrigin("*")
//@Controller
//public class ReturnRentCarWebController {
//    @Autowired
//    RentCarServiceImpl rentCarService;
//    @Autowired
//    CarServiceImpl carService;
//    @Autowired
//    CustomerServiceImpl customerService;
//    @Autowired
//    PersonServiceImpl personService;
//    @Autowired
//    ReturnRentCarServiceImpl returnRentCarService;
//
//    /*
//
//    * LIST
//
//     */
//
//    @RequestMapping("/list")
//    public String showAll(Model model){
//        List<ReturnRentCar> list = returnRentCarService.getAll();
//
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        model.addAttribute("RentCar", list);
//        return "/returnrentcar/returnrentcarList";
//    }
//
//    /*
//
//     * RETURN GET
//
//     */
//
//    @RequestMapping(value = "/return/{id}", method = RequestMethod.GET)
//    public String returnCar(Model model, @PathVariable("id") String id){
//
//        RentCar rentCarToReturn = rentCarService.get(id);
//        RentCarForm rentCarForm = new RentCarForm();
//
//        rentCarForm.setId(rentCarToReturn.getId());
//        LocalDate date = rentCarToReturn.getDateOfIssue();
//        String dateString = date.getMonth() + "/" + date.getDayOfMonth() + "/" + date.getYear();
//        rentCarForm.setDateOfIssue(dateString);
//        date = rentCarToReturn.getReturnDate();
//        dateString = date.getMonth() + "/" + date.getDayOfMonth() + "/" + date.getYear();
//        rentCarForm.setReturnDate(dateString);
////
////        rentCarForm.setCarID(rentCarToReturn.getCar().getId());
////        rentCarForm.setCarBrand(rentCarToReturn.getCar().getBrandCar());
////        rentCarForm.setCarModel(rentCarToReturn.getCar().getModelCar());
////        rentCarForm.setCarNumber(rentCarToReturn.getCar().getLicenseNumberPlates());
//
//        rentCarForm.setCustomerID(rentCarToReturn.getCustomer().getId());
//        rentCarForm.setCustomerFirstName(rentCarToReturn.getCustomer().getPerson().getFirstName());
//        rentCarForm.setCustomerLastName(rentCarToReturn.getCustomer().getPerson().getLastName());
//        rentCarForm.setCustomerMiddleName(rentCarToReturn.getCustomer().getPerson().getMiddleName());
//        LocalDate dateReturn = rentCarToReturn.getReturnDate();
//        LocalDate dateOfIssue = rentCarToReturn.getDateOfIssue();
//        long dateInt = Duration.between(dateOfIssue.atStartOfDay(), dateReturn.atStartOfDay()).toDays();
//        double returnCost = rentCarToReturn.getCar().getRentalPrice() * dateInt;
//        rentCarForm.setReturnCost(returnCost);
//        rentCarForm.setCarRentalPrice(rentCarToReturn.getCar().getRentalPrice());
//
//        model.addAttribute("RentCarForm", rentCarForm);
//
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/returnrentcar/rentToReturn";
//    }
//
//    /*
//
//    * RETURN POST
//
//     */
//
//    @RequestMapping(value = "/return/{id}", method = RequestMethod.POST)
//    public String updateCustomer(@PathVariable("id") String id,
//                                 @ModelAttribute("RentCarForm") RentCarForm rentCarForm){
//        RentCar newRentCar = rentCarService.get(id);
//        ReturnRentCar newReturnRentCar = new ReturnRentCar(newRentCar, rentCarForm.getReturnCost(),rentCarForm.getRepairCost() + rentCarForm.getReturnCost());
//        returnRentCarService.create(newReturnRentCar);
//        return "redirect:/CarRentals/rentCar/list";
//    }
//}
