package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    protected Value<String> name;
    protected Value<Integer> age;
    protected Value<Date> birthDate;

    public Person(String aName, int anAge, Date aDate) {
        this.name = new Value<String>(aName);
        this.age = new Value<Integer>(anAge);
        this.birthDate = new Value<Date>(aDate);
    }



}
