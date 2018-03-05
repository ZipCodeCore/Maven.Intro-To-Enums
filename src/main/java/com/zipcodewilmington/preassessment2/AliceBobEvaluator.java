package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String name;

    public AliceBobEvaluator(String name){
        this.name = name;
    }

    public boolean isAlice(){
        String input = "Alice";
        return (input.equals(name));

    }

    public boolean isBob(){
        String input = "Bob";
        return (input.equals(name));

    }
}
