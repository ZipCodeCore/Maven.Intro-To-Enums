package com.zipcodewilmington.preassessment2;

import javax.swing.*;

public enum AliceBobEnum {

    ALICE("ALICE"),
    BOB("BOB");

    private String name = "";
    private String catchPhrase = "";


    AliceBobEnum(String name){
        this.name = name;
        this.catchPhrase = "Hey, my name is " + name + "!";
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isAlice(){
        if (this.name.equals("ALICE")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob(){
        if (this.name.equals("BOB")){
            return true;
        } else {
            return false;
        }
    }
}
