package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE("Alice"),
    BOB("Bob");

    private String name;

    AliceBobEnum(String aName) {
       this.name = aName;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + this + "!";
    }

    public boolean isAlice() {
        if (this.name.equalsIgnoreCase("Alice")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob() {
        if (this.name.equalsIgnoreCase("Bob")) {
            return true;
        } else {
            return false;
        }
    }

}
