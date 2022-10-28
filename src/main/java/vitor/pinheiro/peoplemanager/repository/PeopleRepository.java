package vitor.pinheiro.peoplemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vitor.pinheiro.peoplemanager.model.Person;

import java.util.Optional;

/**
 * Long is the type of the primary key (on Person class).
 */
public interface PeopleRepository extends JpaRepository<Person, Long> {
    void deletePersonBy_id(Long id); // the SQL is generated automaticaly by spring because of the name of the method!

    Optional<Person> findPersonBy_id(Long id);
}
