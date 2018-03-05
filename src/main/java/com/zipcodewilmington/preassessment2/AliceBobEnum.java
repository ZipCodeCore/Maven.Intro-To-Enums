package com.zipcodewilmington.preassessment2;


//public class AliceBobEnum {
//    private String name;

import com.sun.org.apache.xpath.internal.operations.Bool;

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
        return name().equals("ALICE");
    }

    public Boolean isBob(){
        return name().equals("BOB");
    }
}


//Pseudo-Code:
//first I thought to create a regular class, but I noticed the term enum
//an enum has a finite number of named values.
//like t-shirt sizes, Alice is to Small and the String value inside the () is to "Small"
//needed to create a getCatchPhrase method like in the test it returns "Hey, my name is "...
//isAlice and isBob checks to see if the names equal the expected Stings.
//the had to create a instance variable for catchphrase















