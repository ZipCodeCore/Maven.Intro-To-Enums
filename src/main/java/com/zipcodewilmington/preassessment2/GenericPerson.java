package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class GenericPerson <E extends Person>{

    private Date birthDate = new Date(System.currentTimeMillis());
    private int age;
    public String name;
    private Person person;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
