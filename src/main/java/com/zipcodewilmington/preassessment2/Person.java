package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {

    public SomeValue<String> name;
    public SomeValue<Integer> age;
    public SomeValue<Date> birthDate;


    public Person(String name, Integer age, Date birthdate) {
        this.age = new SomeValue<Integer>(age);
        this.name = new SomeValue<String>(name);
        this.birthDate = new SomeValue<Date>(birthdate);
    }
}
