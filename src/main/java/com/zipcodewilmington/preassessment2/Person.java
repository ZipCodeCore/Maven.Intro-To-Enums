package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    String expectedName;
    int expectedAge;
    Date expectedBirthDate;

    public Person(String expectedName, int expectedAge, Date expectedBirthDate) {
        this.expectedAge = expectedAge;
        this.expectedName = expectedName;
        this.expectedBirthDate = expectedBirthDate;
    }

    public String getExpectedName(){
        return expectedName;
    }

    public int getExpectedAge(){
        return expectedAge;
    }

    public Date getExpectedBirthDate(){
        return expectedBirthDate;
    }

    public void value(){
        this.value = value;
    }
}
