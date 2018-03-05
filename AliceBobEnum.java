package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    BOB("BOB", "Hey, my name is BOB!"),
    ALICE("ALICE", "Hey, my name is ALICE!");

    private String name;
    private String catchPhrase;

    AliceBobEnum(String name, String catchPhrase){
        this.name = name;
        this.catchPhrase = catchPhrase;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isBob(){
        return this.name.equalsIgnoreCase("bob");
    }

    public boolean isAlice(){
        return this.name.equalsIgnoreCase("alice");
    }
}