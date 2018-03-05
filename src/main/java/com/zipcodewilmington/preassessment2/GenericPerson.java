package com.zipcodewilmington.preassessment2;

public class GenericPerson <E> {

    GenericPerson<E> person;

    private E information;


    public GenericPerson(E information) {
        this.information = information;
    }

    public E getValue() {
        return information;
    }

    public void setValue(E information) {
        this.information = information;
    }
}
