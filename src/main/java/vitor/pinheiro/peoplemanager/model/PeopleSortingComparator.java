package vitor.pinheiro.peoplemanager.model;

import vitor.pinheiro.peoplemanager.model.Person;
import java.util.Comparator;

public class PeopleSortingComparator<Person> implements Comparator<vitor.pinheiro.peoplemanager.model.Person> {
    @Override
    public int compare(vitor.pinheiro.peoplemanager.model.Person person1, vitor.pinheiro.peoplemanager.model.Person person2) {
        return person1.get_lastVibration().compareTo(person2.get_lastVibration());
    }
}
