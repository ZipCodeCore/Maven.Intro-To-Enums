package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    Name name;
    Age age;
    BirthDate birthDate;

    public Person(String name, Integer age, Date birthDate) {
        this.name = new Name(name);
        this.age = new Age(age);
        this.birthDate = new BirthDate(birthDate);
    }

}
