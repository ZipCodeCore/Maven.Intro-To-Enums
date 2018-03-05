package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    private String name;

    AliceBobEvaluator(String name) {
        this.name = name;
    }

    public boolean isBob(){
        return (name == "Bob" ? true : false);
    }

    public boolean isAlice(){
        return (name == "Alice" ? true : false);
    }


}
