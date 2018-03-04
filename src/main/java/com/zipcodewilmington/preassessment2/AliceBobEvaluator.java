package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String input;

    public AliceBobEvaluator(String input){
        this.input = input;
    }

    public boolean isAlice(){
        return this.input.equalsIgnoreCase("Alice");
    }

    public boolean isBob(){
        return this.input.equalsIgnoreCase("Bob");
    }

}
