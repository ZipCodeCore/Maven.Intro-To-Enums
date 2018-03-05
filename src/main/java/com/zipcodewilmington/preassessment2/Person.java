package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthDate;


    public Person(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;

    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    private Date getBirthDate() {
        return this.birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

