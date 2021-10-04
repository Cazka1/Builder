package com.company;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private int id;
    private String country;

    public PersonBuilder name(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder surname(String surname){
        this.surname = surname;
        return this;
    }
    public PersonBuilder age(int age){
        this.age = age;
        return this;
    }
    public PersonBuilder id(int id){
        this.id = id;
        return this;
    }
    public PersonBuilder country(String country){
        this.country = country;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public Person build(){
    return new Person(this);
    }
}
