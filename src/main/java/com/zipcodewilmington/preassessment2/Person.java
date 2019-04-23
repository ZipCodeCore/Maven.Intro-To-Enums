package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person{
    public GenericPerson<String> name;
    public GenericPerson<Integer> age;
    public GenericPerson<Date> birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = new GenericPerson<String>(name);
        this.age = new GenericPerson<Integer>(age);
        this.birthDate = new GenericPerson<Date>(birthDate);
    }


}
