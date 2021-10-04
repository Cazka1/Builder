package com.company;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int id;
    private String country;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
        this.id = personBuilder.getId();
        this.country = personBuilder.getCountry();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", country='" + country + '\'' +
                '}';
    }
}
