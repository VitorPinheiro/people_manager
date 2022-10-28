package vitor.pinheiro.peoplemanager.exception;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(String message) {
        super(message);
    }
}
