package com.zipcodewilmington.preassessment2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {

    public Value<String> name;
    public Value<Integer> age;
    public Value<Date> birthDate;

    public Person (String name, Integer age, Date birthDate) {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthDate);

    }
}
