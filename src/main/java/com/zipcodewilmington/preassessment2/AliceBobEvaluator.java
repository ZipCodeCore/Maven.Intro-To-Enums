package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String name = "";

    public AliceBobEvaluator(String name){
        this.name = name;
    }

    public boolean isAlice(){
        if (this.name.equals("Alice")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob(){
        if (this.name.equals("Bob")){
            return true;
        } else {
            return false;
        }
    }
}
