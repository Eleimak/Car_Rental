package tam.group_bbv181.car_rentals.dao.person.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.group_bbv181.car_rentals.dao.person.interfaces.IPersonDAO;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.repository.mongodb.PersonMongoRepository;

import java.util.List;

@Component
@Qualifier("mongodb")
public class PersonDAOImpl implements IPersonDAO {

    private final PersonMongoRepository repository;

    public PersonDAOImpl(PersonMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person create(Person person) {
        return repository.save(person);
    }

    @Override
    public Person get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public Person delete(String id) {
        Person person = this.get(id);
        repository.delete(person);
        return person;
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }
}
