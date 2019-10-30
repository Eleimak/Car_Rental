package tam.group_bbv181.car_rentals.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.forms.CustomerForm;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rentals.services.login.impls.LoginServiceImpl;
import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/CarRentals")
@CrossOrigin("*")
@Controller
public class CustomerWebController {
    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    LoginServiceImpl loginService;

    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/customer/list")
    public String showAll(Model model){
        List<Customer> list = customerService.getAll();
        model.addAttribute("customers", list);
        return "/customer/customerList";
    }

    @RequestMapping(value = "/customer/create", method = RequestMethod.GET)
    public String add(Model model){
        CustomerForm customerForm = new CustomerForm();
        List gender = Arrays.asList(
                "man", "woman");
        model.addAttribute("Gender", gender);
        model.addAttribute("CustomerForm", customerForm);
        return "/customer/customerAdd";
    }

    @RequestMapping(value = "/customer/create", method = RequestMethod.POST)
    public String create(Model model,@ModelAttribute("CustomerForm")
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
        customerService.create(newCustomer);
        return "redirect:/CarRentals/customer/create";
    }

    @RequestMapping("/userAccount/{id}")
    public String userAccount(Model model,@PathVariable(value = "id")String id){
        Customer customer = customerService.get(id);
        model.addAttribute("customer", customer);
        return "accountUser";
    }

    // @PostMapping("/update/{id}")
    @RequestMapping(value = "/customer/update/{id}", method = RequestMethod.GET)
    public String updateCustomer(Model model,  @PathVariable("id") String id){
        Customer customerToUpdate = customerService.get(id);
        CustomerForm customerForm = new CustomerForm();
        customerForm.setIdPerson(customerToUpdate.getPerson().getId());
        customerForm.setFirstName(customerToUpdate.getPerson().getFirstName());
        customerForm.setLastName(customerToUpdate.getPerson().getLastName());
        customerForm.setMiddleName(customerToUpdate.getPerson().getMiddleName());
        List listGender = new ArrayList();
        if(customerToUpdate.getPerson().isGender()){
            listGender.add("man");
            listGender.add("woman");
        }
        else{
            listGender.add("woman");
            listGender.add("man");
        }
        model.addAttribute("ListGender", listGender);
        customerForm.setAddress(customerToUpdate.getAddress());
        customerForm.setPhone(customerToUpdate.getPhone());
        customerForm.seteMail(customerToUpdate.geteMail());
        customerForm.setBonusPoints(customerToUpdate.getBonusPoints());
        List listCars = Arrays.asList(customerToUpdate.getCarList());
        model.addAttribute("ListCars", listCars);
        model.addAttribute("CustomerForm", customerForm);
        return "/customer/customerToUpdate";
    }

    @RequestMapping(value = "/customer/update/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("CustomerForm") CustomerForm
                                     customerForm){
        boolean gender;
        if(customerForm.getGender().equals("man")){
            gender = true;
        }else{
            gender = false;
        }
        Person newPerson = new Person(customerForm.getFirstName(),
                customerForm.getLastName(), customerForm.getMiddleName(),
                gender);
        newPerson.setId(customerForm.getIdPerson());
        Customer newCustomer = new Customer(newPerson, customerForm.getAddress(), customerForm.getPhone(),
                customerForm.geteMail());
        newCustomer.setBonusPoints(customerForm.getBonusPoints());
        newCustomer.setId(customerForm.getId());
        customerService.update(newCustomer);
        return "redirect:/CarRentals/customer/list";
    }

    @RequestMapping("/customer/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        customerService.delete(id);
        return "redirect:/CarRentals/customer/list";
    }
}
