package com.zipcodewilmington.preassessment2;


public class GenericTesting<T> {

    private T info;

    public GenericTesting(T info) {
        this.info = info;
    }

    public T getValue() {
        return this.info;
    }
}

