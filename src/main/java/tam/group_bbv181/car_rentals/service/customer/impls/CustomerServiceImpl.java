package tam.group_bbv181.car_rentals.service.customer.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.customer.interfaces.ICustomerDAO;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.service.customer.interfaces.ICustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerDAO iCustomerDAO;

    public CustomerServiceImpl(@Qualifier("mongodb") ICustomerDAO iCustomerDAO) {
        this.iCustomerDAO = iCustomerDAO;
    }

    @Override
    public Customer create(Customer customer) {
        return iCustomerDAO.create(customer);
    }

    @Override
    public Customer get(String id) {
        return iCustomerDAO.get(id);
    }

    @Override
    public Customer update(Customer customer) {
        return iCustomerDAO.update(customer);
    }

    @Override
    public Customer delete(String id) {
        return iCustomerDAO.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        return iCustomerDAO.getAll();
    }
}
