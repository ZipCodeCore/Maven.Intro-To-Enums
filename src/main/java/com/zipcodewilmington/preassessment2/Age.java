package com.zipcodewilmington.preassessment2;

public class Age implements GenericPerson {
    Integer age;

    public Age(Integer age) {
        this.age = age;
    }

    public Integer getValue() {
        return this.age;
    }
}
