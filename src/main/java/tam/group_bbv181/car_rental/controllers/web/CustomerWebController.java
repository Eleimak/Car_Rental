package tam.group_bbv181.car_rental.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rental.model.Customer;
import tam.group_bbv181.car_rental.services.customers.impls.CustomerServiceImpl;
import tam.group_bbv181.car_rental.services.login.impls.LoginServiceImpl;

import java.util.List;

@RequestMapping("/CarRentals")
@CrossOrigin("*")
@Controller
public class CustomerWebController {
    @Autowired
    CustomerServiceImpl customersService;

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping("/customers/list")
    public String showAll(Model model){
        List<Customer> list = customersService.getAll();
        model.addAttribute("customers", list);
        return "customerslist";
    }


    @RequestMapping("/customers/delete/{id}")
    public String delete(Model model,@PathVariable(value = "id")String id){
        customersService.delete(id);
        List<Customer> list = customersService.getAll();
        return "redirect:/CarRentals/customers/list";
    }

    @RequestMapping("/userAccount/{id}")
    public String userAccount(Model model,@PathVariable(value = "id")String id){
        Customer customer = customersService.get(id);
        model.addAttribute("customers", customer);
        return "usersAccount";
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
