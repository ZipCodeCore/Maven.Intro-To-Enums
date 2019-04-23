package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {


    ALICE("ALICE", "Hey, my name is ALICE!"),
    BOB("BOB", "Hey, my name is BOB!");

    String name;
    String catchPhrase;

    AliceBobEnum(String name, String catchPhrase){
        this.name = name;
        this.catchPhrase = catchPhrase;
    }

    String getCatchPhrase(){
        return this.catchPhrase;
    }

    boolean isAlice(){
        return this.equals(AliceBobEnum.ALICE);
    }

    boolean isBob(){
        return this.equals(AliceBobEnum.BOB);
    }


}
