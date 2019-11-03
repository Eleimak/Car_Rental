package tam.group_bbv181.car_rentals.services.customer.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.repository.CustomerRepository;
import tam.group_bbv181.car_rentals.repository.LoginRepository;
import tam.group_bbv181.car_rentals.repository.PersonRepository;
import tam.group_bbv181.car_rentals.services.customer.interfaces.ICustomerService;
import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    PersonServiceImpl personService;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer get(String id) {
        return (Customer) customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer create(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    @Override
    public Customer delete(String id) {
        Customer customer = this.get(id);
        customerRepository.deleteById(id);
        personService.delete(customer.getPerson().getId());
        return customer;
    }

    @Override
    public Customer getCustomerPerson(Person person) {
        return customerRepository.findCustomerByPerson(person);
    }

    @Override
    public boolean isNotEmptyFields(Customer customer) {
        if(customer.getAddress().equals("")){return true;}
        if(customer.getPhone().equals("")){return true;}
        if(customer.geteMail().equals("")){return true;}
        return false;
    }
}
