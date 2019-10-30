package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.CustomerForm;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.LoginUser;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.login.impls.LoginServiceImpl;
import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/CarRentals")
@CrossOrigin("*")
@Controller
public class LoginUserWebController {
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    LoginServiceImpl loginService;
    @Autowired
    PersonServiceImpl personService;

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signIn(Model model){
        LoginUser loginUser = new LoginUser();
        model.addAttribute("LoginUser", loginUser);
        return "/loginuser/loginUser";
    }
/*
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String SignIn(Model model,@ModelAttribute("LoginUser")
            LoginUser loginUser){
        if(loginService.userAccount(loginUser.getUsername(),
                loginUser.getPassword()) != null) {
            model.addAttribute("LoginUser", loginUser);
            String redirectStr = "redirect:/CarRental/userAccount/" +
                    loginService.userAccount(loginUser.getUsername(),
                            loginUser.getPassword()).getCustomer().getId();
            return redirectStr;
        }
        return "redirect:/CarRentals/signIn";
    }
*/
 /*   @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String addCustomer(Model model){
        CustomerForm customerForm = new CustomerForm();
        List manWoman = Arrays.asList(
                "man", "woman");
        model.addAttribute("manWoman", manWoman);
        model.addAttribute("CustomersForm", customerForm);
        return "/loginuser/registrationUser";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String create(Model model,@ModelAttribute("CustomersForm")
            CustomerForm customerForm){

        boolean gender;
        if(customerForm.getGender().equals("man")){
            gender = true;
        }else{
            gender = false;
        }
        Person newPerson = new Person(customerForm.getFirstName(),
                customerForm.getLastName(), customerForm.getMiddleName(),
                gender);
        if(!loginService.uniqueLogin(customerForm.getLogin()) ||
                !personService.isNotEmptyFields(newPerson)){
            return "redirect:/CarRentals/signUp";
        }
        Customer newCustomer = new Customer(personService.create(newPerson), customerForm.getAddress(),
                customerForm.getPhone(), customerForm.geteMail());
      //!!!!!!!!!!!!!!!!  LoginUser loginUser = new LoginUser(customerForm.getLogin(), customerForm.getPassword(),
      //!!!!!!!!!!!!!!!!          customerService.create(newCustomer));
        return "redirect:/CarRentals/userAccount/"; //!!!!!!!!!!!!!!!!!+ loginService.create(loginUser).getCustomer().getId();
    }
/*

    // @PostMapping("/update/{id}")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateWorker(Model model,  @PathVariable("id") String id){
        Worker workerToUpdate = workerService.get(id);
        WorkerForm workerForm = new WorkerForm();
        workerForm.setName(workerToUpdate.getName());
        workerForm.setOccupation(workerToUpdate.getOccupation());
        workerForm.setSalary(workerToUpdate.getSalary());
        workerForm.setSpeciality(workerToUpdate.getSpeciality().getName());
        Map<String, String> mavs = (Map<String, String>)
                specialityServices.getAll().stream()
                        .collect(Collectors.toMap(Speciality::getId,
                                Speciality::getName));

        model.addAttribute("mavs", mavs);
        model.addAttribute("WorkerForm", workerForm);
        return "workerupdate";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("WorkerForm")
                                 WorkerForm workerForm){
        Worker newWorker = new Worker(workerForm.getName(),
                workerForm.getOccupation(),workerForm.getSalary(),
                specialityServices.get(workerForm.getSpeciality()),
                LocalDateTime.parse(workerForm.getEmploymentDay(),
                        DateTimeFormatter.ofPattern("HH:mm MM/dd/yyyy")));
        newWorker.setId(workerForm.getId());
        workerService.update(newWorker);
        return "redirect:/worker/list";
    }
*/

}
