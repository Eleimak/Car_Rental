package tam.group_bbv181.car_rentals.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.service.customer.impls.CustomerServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerRestController {

    CustomerServiceImpl service;

    @Autowired
    public CustomerRestController(CustomerServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public Customer delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer){
        return service.create(customer);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer){
        return service.create(customer);
    }
}
