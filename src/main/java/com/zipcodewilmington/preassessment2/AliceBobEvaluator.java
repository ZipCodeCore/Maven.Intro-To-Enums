package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() { //ignore the casing based on input
        return input.equalsIgnoreCase("Alice");
    }

    public boolean isBob() {
        return input.equalsIgnoreCase("Bob");
    }
}