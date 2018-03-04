package com.zipcodewilmington.preassessment2;

public class Attributes<T> {

    private T attributes;

    public Attributes(T attributes) {
        this.attributes = attributes;
    }

    public T getValue() {
        return attributes;
    }

    public void setValue(T attributes) {
        this.attributes = attributes;
    }
}

