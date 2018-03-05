package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    private String catchPhrase = ("Hey, my name is "+ name()+"!");


    //Methods
    public boolean isAlice(){
        if (this ==  ALICE)
            return true;
        return false;
    }

    public boolean isBob(){
        if (this ==  BOB)
            return true;
        return false;
    }

    public String getCatchPhrase(){
        return this.catchPhrase;
    }

}
