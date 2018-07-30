package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {

    public Values<String> name;
    public Values<Integer> age;
    public Values<Date> birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = new Values<String> (name);
        this.age = new Values<Integer> (age);
        this.birthDate = new Values<Date> (birthDate);
    }
}
