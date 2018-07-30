package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String name;

    public AliceBobEvaluator(String input){
        this.name = input;
    }

    public boolean isAlice(){
        return (this.name.equals("Alice"));
    }

    public boolean isBob(){
        return (this.name.equals("Bob"));
    }
}
