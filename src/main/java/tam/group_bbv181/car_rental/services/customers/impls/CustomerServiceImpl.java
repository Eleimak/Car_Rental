package tam.group_bbv181.car_rental.services.customers.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rental.model.Customer;
import tam.group_bbv181.car_rental.model.Person;
import tam.group_bbv181.car_rental.repository.CustomerRepository;
import tam.group_bbv181.car_rental.repository.PersonRepository;
import tam.group_bbv181.car_rental.services.customers.interfaces.ICustomersService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomersService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    PersonRepository personRepository;

    List<Customer> customerList = new ArrayList<>();

    @PostConstruct
    void init(){
        Person pash = new Person("Bazil","Pash", "Anodov", true);
        Person desi = new Person("Jan","Desi", "Emue", true);
        Person tester = new Person("Anna","Tester", "Oyen", false);

        customerRepository.deleteAll();
        Customer bazil = new Customer(pash,"qwrewt",45679689,"qwer@gmail.com");
        Customer jan = new Customer(desi,"zxcxczcz",436554,"asdf@gmail.com");
        Customer anna = new Customer(tester,"wqqrrwer", 323774,"zvcx@mail.com");
        anna.setBonusPoints(7);
        bazil.setBonusPoints(20);
        customerList.add(bazil);
        customerList.add(jan);
        customerList.add(anna);
        customerRepository.saveAll(customerList);
    }
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
        return customer;
    }
}
