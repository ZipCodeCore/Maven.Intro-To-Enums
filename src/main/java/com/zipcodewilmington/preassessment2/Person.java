package com.zipcodewilmington.preassessment2;


import java.util.Date;

public class Person {

    GenericTesting<String> name;
    GenericTesting<Integer> age;
    GenericTesting<Date> birthDate;

    public Person(String name, int age, Date birthDate){
        this.name = new GenericTesting<>(name);
        this.age = new GenericTesting<>(age);
        this.birthDate = new GenericTesting<>(birthDate);
    }
}
