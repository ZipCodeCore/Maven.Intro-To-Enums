package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    public Wrapper<String> name;
    public Wrapper<Integer> age;
    public Wrapper<Date> birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = new Wrapper<String>(name);
        this.age = new Wrapper<Integer>(age);
        this.birthDate = new Wrapper<Date>(birthDate);
    }
}
