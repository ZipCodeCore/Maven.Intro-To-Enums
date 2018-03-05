package com.zipcodewilmington.preassessment2;



import java.util.Date;

public class Person {
    public final Value<String> name;
    public final Value<Integer> age;
    public final Value<Date> birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = new Value<String>(name);
        this.age = new Value<Integer>(age);
        this.birthDate = new Value<Date>(birthDate);
    }


}
//Pseudo-Code:
//The class should instantiate an Value field of Person objects labeled: name,age, and birthDate.
//Created a Person class so for every test, new Person objects can be created(think I wrote that right)
//Next; a public accessor - to be accessed from any class; and added final so it states, "I'm immutable"
