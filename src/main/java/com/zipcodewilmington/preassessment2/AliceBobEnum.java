package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE("Hey, my name is ALICE!", "alice"),
    BOB("Hey, my name is BOB!", "bob");

    public String catchPhrase;
    public String name;


    AliceBobEnum (String catchPhrase, String name) {
        this.catchPhrase = catchPhrase;
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isAlice() {
        return name.equalsIgnoreCase("alice");
    }

    public boolean isBob() {
        return name.equalsIgnoreCase("bob");
    }

}
