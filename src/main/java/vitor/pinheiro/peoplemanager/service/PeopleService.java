package vitor.pinheiro.peoplemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vitor.pinheiro.peoplemanager.exception.PersonNotFoundException;
import vitor.pinheiro.peoplemanager.model.Person;
import vitor.pinheiro.peoplemanager.repository.PeopleRepository;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository _peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        _peopleRepository = peopleRepository;
    }

    public Person addPerson(Person person) {
        person.set_lastVibration(null);
        person.set_imageUrl(null);
        return _peopleRepository.save(person);
    }

    public List<Person> findAllPeople() {
        return _peopleRepository.findAll();
    }

    public Person updatePerson(Person person) {
        return _peopleRepository.save(person);
    }

    public Person findPersonById(Long id) {
        return _peopleRepository.findPersonBy_id(id)
                .orElseThrow(() -> new PersonNotFoundException("Person by id "+ id+ " was not found."));
    }

    public void deletePerson(Long id) {
        _peopleRepository.deletePersonBy_id(id);
    }
}
