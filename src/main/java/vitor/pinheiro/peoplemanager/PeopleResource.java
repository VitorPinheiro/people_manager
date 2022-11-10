package vitor.pinheiro.peoplemanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vitor.pinheiro.peoplemanager.model.Person;
import vitor.pinheiro.peoplemanager.service.PeopleService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleResource {
    private final PeopleService _peopleService;


    public PeopleResource(PeopleService peopleService) {
        _peopleService = peopleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPeople() {
        List<Person> people = _peopleService.findAllPeople();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @GetMapping("/find/{_id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("_id") Long id) {
        Person person = _peopleService.findPersonById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person person){
        Person newPerson = _peopleService.addPerson(person);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person){
        Person updatePerson = _peopleService.updatePerson(person);
        return new ResponseEntity<>(updatePerson, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{_id}")
    public ResponseEntity<?> deletePerson(@PathVariable("_id") Long id){
        _peopleService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
