package com.zipcodewilmington.preassessment2;

public class Value<T> {

    private T value;

    public Value(T objectValue) {
        this.value = objectValue;
    }

    public T getValue() {
        return this.value;
    }
}
