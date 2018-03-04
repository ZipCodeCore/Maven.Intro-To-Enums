package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person <T> {

    T name;
    T age;
    T birthDate;

    public Person (T name, T age, T birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }



}
