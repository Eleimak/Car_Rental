//package tam.group_bbv181.car_rentals.controllers.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import tam.group_bbv181.car_rentals.model.Car;
//import tam.group_bbv181.car_rentals.model.Customer;
//import tam.group_bbv181.car_rentals.model.LoginUser;
//import tam.group_bbv181.car_rentals.model.Person;
//import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
//import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
//import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.util.stream.Collectors.joining;
//
//
//@CrossOrigin("*")
//@Controller
//public class MainWebController {
//    @Autowired
//    CarServiceImpl carService;
//    @Autowired
//    CustomerServiceImpl customerService;
//    @Autowired
//    PersonServiceImpl personService;
//
//
//    @RequestMapping ("/")
//    String mainPage(Model model){
//        boolean isAuthenticated;
//        // checking if someone is logged in
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails){
//            isAuthenticated = true;
//        }
//        else {
//            isAuthenticated = false;
//        }
//
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//
//         //   User user = (User) authentication.getPrincipal();
//           // model.addAttribute("username", user.getUsername());
//           // model.addAttribute("roles", user.getAuthorities());//user.getAuthorities().stream().map(Role::getAuthority).collect(joining(","))
//        }
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        return "index";
//    }
//
//    @RequestMapping ("/s")
//    String mainPage1(Model model) {
//        return "login";
//    }
//
//    @RequestMapping (value = "/login", method = RequestMethod.GET)
//    String login(Model model,
//                 @RequestParam(value="error", required = false) String error,
//                 @RequestParam(value="logout", required = false) String logout){
//
//        model.addAttribute("error", error != null);
//        model.addAttribute("logout", logout != null);
//
//        return "login";
//    }
//
//    @RequestMapping ("/admin")
//    String mainAdmin(){
//        return "administrator/mainAdmin";
//    }
//
//    @RequestMapping("/Search")
//    public String showSearch(Model model){
//        List<Car> listCar = carService.getAll();
//        List<Customer> listCustomer = customerService.getAll();
//        List<String> listFull = new ArrayList<>();
//        for (Car item :listCar) {
//            listFull.add(item.toString());
//        }
//        for (Customer item :listCustomer) {
//            listFull.add(item.toString());
//        }
//        model.addAttribute("listFull", listFull);
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
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/listSearch";
//    }
//}
