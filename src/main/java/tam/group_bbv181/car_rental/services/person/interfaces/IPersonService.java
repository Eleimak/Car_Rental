package tam.group_bbv181.car_rental.services.person.interfaces;

import tam.group_bbv181.car_rental.model.Person;
import java.util.List;

public interface IPersonService {
    List<Person> getAll();

    Person get(String id);
    Person create(Person person);
    Person update(Person person);
    Person delete(String id);

    boolean isNotEmptyFields(Person person);
}
