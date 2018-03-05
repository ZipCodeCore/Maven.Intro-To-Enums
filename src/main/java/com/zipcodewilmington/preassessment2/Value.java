package com.zipcodewilmington.preassessment2;

public class Value<T> { //generic value class, using parameter type "type" data type
    private T value;
    //getter and setter for my generic value type
    public Value(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

