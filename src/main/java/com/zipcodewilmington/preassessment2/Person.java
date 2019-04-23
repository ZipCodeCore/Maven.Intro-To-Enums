package com.zipcodewilmington.preassessment2;


import java.util.Date;

public class Person {

    public Value<String> name;
    public Value<Integer> age;
    public Value<Date> birthDate;


    public Person(String expectedName, int expectedAge, Date expectedBirthDate){
        this.name = new Value<String>(expectedName);
        this.age = new Value<Integer>(expectedAge);
        this.birthDate = new Value<Date>(expectedBirthDate);
    }
}
