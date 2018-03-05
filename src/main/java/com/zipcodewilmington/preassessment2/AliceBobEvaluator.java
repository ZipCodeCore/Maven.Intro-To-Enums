package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String name;

    AliceBobEvaluator(String name){
        this.name = name;
    }
    public boolean isBob(){
        return this.name.equals("Bob");
    }
    public boolean isAlice(){
        return this.name.equals("Alice");
    }
}
