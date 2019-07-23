package com.stackroute.JDBC;

public class Persons{
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;


    //Default Constructor
    public Persons(){}

    public Persons(int id, String firstname, String lastname, String address, String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Persons setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstname;
    }

    public Persons setFirstName(String firstName) {
        this.firstname = firstname;
        return this;
    }

    public String getLastName() {
        return lastname;
    }

    public Persons setLastName(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Persons setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Persons setCity(String city) {
        this.city = city;
        return this;
    }


}
