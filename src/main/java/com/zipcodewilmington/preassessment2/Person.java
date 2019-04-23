package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person{

    public Value<String> name;
    public Value<Integer> age;
    public Value<Date> birthDate;

    //setting the declaration of a new value in to this.~~~
    public Person(String name, int age, Date birthDate) {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthDate);
    }

}

