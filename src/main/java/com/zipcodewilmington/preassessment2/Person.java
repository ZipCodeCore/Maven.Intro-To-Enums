package com.zipcodewilmington.preassessment2;

import java.util.ArrayList;
import java.util.Date;

public class Person {
        public Attributes<String> name;
        public Attributes<Integer> age;
        public Attributes<Date> birthDate;
        
    public Person(String name, int age,Date birthDate) {
        this.name = new Attributes<String>(name);
        this.age = new Attributes<Integer>(age);
        this.birthDate = new Attributes<Date>(birthDate);
    }
}

