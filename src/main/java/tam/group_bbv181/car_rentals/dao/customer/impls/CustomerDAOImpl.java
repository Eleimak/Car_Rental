package tam.group_bbv181.car_rentals.dao.customer.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.customer.interfaces.ICustomerDAO;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.repository.mongodb.CustomerMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CustomerDAOImpl implements ICustomerDAO {

    private final CustomerMongoRepository repository;

    public CustomerDAOImpl(CustomerMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer delete(String id) {
        Customer customer = this.get(id);
        repository.delete(customer);
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
