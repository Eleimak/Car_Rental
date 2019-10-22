package tam.group_bbv181.car_rentals.services.person.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.repository.PersonRepository;
import tam.group_bbv181.car_rentals.services.person.interfaces.IPersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person get(String id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person delete(String id) {
        Person person = this.get(id);
        personRepository.deleteById(id);
        return person;
    }

    @Override
    public boolean isNotEmptyFields(Person person) {
        if(person.getFirstName().equals("")){return false;}
        if(person.getLastName().equals("")){return false;}
        if(person.getMiddleName().equals("")){return false;}
        return true;
    }
}
