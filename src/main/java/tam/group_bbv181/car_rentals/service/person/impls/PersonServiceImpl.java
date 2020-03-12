package tam.group_bbv181.car_rentals.service.person.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.dao.person.interfaces.IPersonDAO;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.service.person.interfaces.IPersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDAO iPersonDAO;

    public PersonServiceImpl(@Qualifier("mongodb") IPersonDAO iPersonDAO) {
        this.iPersonDAO = iPersonDAO;
    }

    @Override
    public Person create(Person person) {
        return iPersonDAO.create(person);
    }

    @Override
    public Person get(String id) {
        return iPersonDAO.get(id);
    }

    @Override
    public Person update(Person person) {
        return iPersonDAO.update(person);
    }

    @Override
    public Person delete(String id) {
        return iPersonDAO.delete(id);
    }

    @Override
    public List<Person> getAll() {
        return iPersonDAO.getAll();
    }
}
