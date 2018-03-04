package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("Hey, my name is ALICE!"),
    BOB("Hey, my name is BOB!");

    private final String catchPhrase;

    AliceBobEnum(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public Boolean isAlice(){
        return this.name().equalsIgnoreCase("alice");
    }
    public Boolean isBob(){
        return this.name().equalsIgnoreCase("bob");
    }
}
