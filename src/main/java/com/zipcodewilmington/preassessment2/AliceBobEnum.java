package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE, BOB;

    public String getCatchPhrase() {
        return "Hey, my name is " + name() + "!";
    }

    public boolean isAlice() {
       return name().equals("ALICE");
    }

    public boolean isBob() {
        return name().equals("BOB");
    }
}

