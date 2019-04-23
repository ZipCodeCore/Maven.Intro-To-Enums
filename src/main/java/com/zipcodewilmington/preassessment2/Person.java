package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    public GenericIdentity<String>name;
    public GenericIdentity<Integer>age;
    public GenericIdentity<Date>birthDate;


    public Person(String name,Integer age, Date birthDate){
        this.name = new GenericIdentity<String>(name);
        this.age = new GenericIdentity<Integer>(age);
        this.birthDate = new GenericIdentity<Date>(birthDate);
    }

}
