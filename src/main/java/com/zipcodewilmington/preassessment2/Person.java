package com.zipcodewilmington.preassessment2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person <T, E> {

    Map<T, E> personInfo = new HashMap<>();
    T name;
    T age;
    T birthDate;

    public Person (E name, E age, E birthDate) {
        personInfo.put(this.name, name);
        personInfo.put(this.age, age);
        personInfo.put(this.birthDate, birthDate);

    }
}
