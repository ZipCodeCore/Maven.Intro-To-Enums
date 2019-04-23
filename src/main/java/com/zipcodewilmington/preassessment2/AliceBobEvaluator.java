package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator  {

    String name;

    public AliceBobEvaluator(String input){
        this.name = input;
    }

    public boolean isBob(){
        return this.name.equalsIgnoreCase("bob");
    }

    public boolean isAlice(){
        return this.name.equalsIgnoreCase("alice");
    }


}
