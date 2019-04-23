package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    public String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        if(input.equalsIgnoreCase("alice")) {
            return true;
        }return false;
    }

    public boolean isBob() {
        if(input.equalsIgnoreCase("bob")) {
            return true;
        }return false;
    }
}
