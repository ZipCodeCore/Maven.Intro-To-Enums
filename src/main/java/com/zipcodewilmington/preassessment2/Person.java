package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    public Trait<String> name;
    public Trait<Integer> age;
    public Trait<Date> birthDate;


    public Person(String name, int age, Date birthDate) {
        this.name = new Trait<String>(name);
        this.age = new Trait<Integer>(age);
        this.birthDate = new Trait<Date>(birthDate);
    }

}

