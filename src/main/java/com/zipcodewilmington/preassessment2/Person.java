package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    public Names name;
    public Ages age;
    public BirthDates birthDate;

    public Person(String name, int age, Date birthDate){
        this.name = Names.Leon;
        this.age = Ages.TWENTYFOUR;
        this.birthDate = BirthDates.BIRTHDATE;
    }

}
