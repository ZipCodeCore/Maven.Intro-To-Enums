package com.zipcodewilmington.preassessment2;

public class SomeValue<T> {

    private T value;

    public SomeValue(T value) {
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
}
