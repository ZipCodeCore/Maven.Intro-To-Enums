package com.zipcodewilmington.preassessment2;

//created a class called Value with a generic type 'T'
//make T become whatever you want inside the angle brackets
//okay so whatever i put in < >, thats the data type ill return


public class Value<T> {

    private T value;

    public Value(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
