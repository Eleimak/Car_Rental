package tam.group_bbv181.car_rentals.services.person.interfaces;

import tam.group_bbv181.car_rentals.model.LoginUser;
import tam.group_bbv181.car_rentals.model.Person;
import java.util.List;

public interface IPersonService {
    List<Person> getAll();

    Person get(String id);
    Person create(Person person);
    Person update(Person person);
    Person delete(String id);

    Person getPersonLoginUser(LoginUser loginUser);
    boolean isNotEmptyFields(Person person);
}
