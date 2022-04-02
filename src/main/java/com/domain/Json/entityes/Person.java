package com.domain.Json.entityes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long pk;

    private String firstName;
    private String lastName;
    private String address;
    private long id;
    private String country;
    private String email;
    private String ipAdderess;

    public Person() {
    }

//    public Person(String firstName, String lastName, String address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//    }
//
//    public Person(int id, String firstName, String lastName, String address) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//    }

    public Person(Long pk, String firstName, String lastName, String address, long id, String country, String email, String ipAdderess) {
        this.pk = pk;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
        this.country = country;
        this.email = email;
        this.ipAdderess = ipAdderess;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIpAdderess() {
        return ipAdderess;
    }

    public void setIpAdderess(String ipAdderess) {
        this.ipAdderess = ipAdderess;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
