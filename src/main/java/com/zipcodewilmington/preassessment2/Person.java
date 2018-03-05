package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person
{
    Value<String> name;
    Value<Integer> age;
    Value<Date> birthDate;


    public Person(String name, Integer age, Date birthdate)
    {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthdate);
    }

}
