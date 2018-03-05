package com.zipcodewilmington.preassessment2;

public class Trait<Generic> {
    private Generic value;

    public Trait(Generic value) {
        this.value = value;
    }

    public Generic getValue() {
        return value;
    }

}
