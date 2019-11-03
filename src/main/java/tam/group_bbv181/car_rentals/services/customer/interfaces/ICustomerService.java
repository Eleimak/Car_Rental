package tam.group_bbv181.car_rentals.services.customer.interfaces;

import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.Person;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer get(String id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer delete(String id);

    Customer getCustomerPerson(Person person);
    boolean isNotEmptyFields(Customer customer);
}
