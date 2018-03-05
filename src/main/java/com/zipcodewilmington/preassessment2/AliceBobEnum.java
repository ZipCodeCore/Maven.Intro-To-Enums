package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE("Alice", "Hey, my name is ALICE!"),
    BOB("Bob", "Hey, my name is BOB!");


    private String name;
    private String catchPhrase;
    AliceBobEnum(String name, String catchPhrase){
        this.name = name;
        this.catchPhrase = catchPhrase;
    }
    public String getCatchPhrase(){
        return catchPhrase;
    }
    public boolean isBob(){
        return this.name.equals("Bob");
    }
    public boolean isAlice(){
        return this.name.equals("Alice");
    }
}
