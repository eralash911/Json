package com.domain.Json.entityes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "postgres", name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long pk;

    private String firstName;
    private String lastName;
    private String gender;
    private long id;
    private String country;
    private String email;
    private String ipAddress;

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

//    public Person(Long pk, String firstName, String lastName, String address, long id, String country, String email, String ipAdderess) {
//        this.pk = pk;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.id = id;
//        this.country = country;
//        this.email = email;
//        this.ipAddress = ipAdderess;
//    }


    public Person(Long pk, String firstName, String lastName, String gender, long id, String country, String email, String ipAddress) {
        this.pk = pk;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.country = country;
        this.email = email;
        this.ipAddress = ipAddress;
    }



    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
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

    public long getId() {
        return id;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




    @Override
    public String toString() {
        return "Person{" +
                "pk=" + pk +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "\nPerson{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
