package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    BOB("BOB","Hey, my name is BOB!"),
    ALICE("ALICE","Hey, my name is ALICE!");

    final String name;
    final String catchPhrase;

    AliceBobEnum(String name, String catchPhrase) {
        this.name = name;
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return this.catchPhrase;
    }

    public boolean isAlice(){
        return (this.name.equals("ALICE"));
    }

    public boolean isBob(){
        return (this.name.equals("BOB"));
    }

}
