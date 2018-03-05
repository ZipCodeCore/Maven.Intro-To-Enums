package com.zipcodewilmington.preassessment2;

import java.util.Date;
// set each datatype
public class Person{
    public Value<String> name;
    public Value<Integer> age;
    public Value<Date> birthDate;
// setting to specific occurance of each datatype
    public Person(String name, int age, Date birthDate) {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthDate);
    }

}
