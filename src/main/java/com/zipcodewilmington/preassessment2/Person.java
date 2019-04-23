package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    //new generic fields
    public final Value<String> name;
    public final Value<Integer> age;
    public final Value<Date> birthDate;
    //constructor of generic field types
    public Person(String name, int age, Date birthDate) {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthDate);
    }
}