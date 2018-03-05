package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {

    //using generic angled brackets for the type of value

    //made them default accessible because when its default you are not forced to use getters and setters
    //HOWEVER this is NOT the best way to do this.
    //When they are protected they can be subclassed and overwritten...this doesn't allow that.

    Value<Date> birthDate;
    Value<Integer> age;
    Value<String> name;

    //LEFT MY GETTERS AND SETTERS BECAUSE THIS IS THE CORRECT WAY TO ACCESS VARIABLES!

    public Value<Date> getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Value<Date> birthDate) {
        this.birthDate = birthDate;
    }

    public Value<Integer> getAge() {
        return age;
    }

    public void setAge(Value<Integer> age) {
        this.age = age;
    }

    public Value<String> getName() {
        return name;
    }

    public void setName(Value<String> name) {
        this.name = name;
    }

    //constructor created but had to do NEW VALUE<TYPE> and variable
    public Person(String name, int age, Date birthDate) {
        this.birthDate = new Value<Date>(birthDate);
        this.age = new Value<Integer>(age);
        this.name = new Value<String>(name);
    }
}
