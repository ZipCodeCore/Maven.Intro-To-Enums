package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Value<T> {
    private T value;

    public Value(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

//Pseudo-code:
//okay, now we have the generic class Value with a type <T>
//soo...if we look at Person.java the "public final Value<String> name;" the <String> value is now represented by
//<T>, so when we go into GenericPersonTest and call getValue, we go into this method, and grab <T> for that test,
//which is actually <String> name, or <Integer> age, or <Date> birthDate. right?