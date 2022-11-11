package vitor.pinheiro.peoplemanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false) // Once this is set, can never be updated
    private Long _id;
    private String _firstName;
    private String _fullName;
    private String _imageUrl;
    private LocalDate _lastVibration;

    public Person() {
        _imageUrl = null;
        _lastVibration = null;
    }

    public Person(String firstName, String fullName)
    {
        _firstName = firstName;
        _fullName = fullName;
        _imageUrl = null;
        _lastVibration = null;
    }

    public Person(String firstName, String fullName, LocalDate lastVibration)
    {
        _firstName = firstName;
        _fullName = fullName;
        _imageUrl = null;

        _lastVibration = lastVibration;
    }

    public Person(String firstName, String fullName, String imageUrl, LocalDate lastVibration)
    {
        _firstName = firstName;
        _fullName = fullName;
        _imageUrl = imageUrl;
        _lastVibration = lastVibration;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String firstName) {
        _firstName = firstName;
    }

    public String get_fullName() {
        return _fullName;
    }

    public void set_fullName(String fullName) {
        _fullName = fullName;
    }

    public String get_imageUrl() {
        return _imageUrl;
    }

    public void set_imageUrl(String imageUrl) {
        _imageUrl = imageUrl;
    }

    public LocalDate get_lastVibration() {
        return _lastVibration;
    }

    public void set_lastVibration(LocalDate lastVibration) {
        _lastVibration = lastVibration;
    }
}
