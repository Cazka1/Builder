package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .name("Name")
                .surname("Surname")
                .id(9)
                .age(23)
                .country("Country")
                .build();
        Person person1 = new PersonBuilder().name("Person1Name").age(22).build();
        System.out.println(person.toString());
        System.out.println(person1.toString());
    }
}
