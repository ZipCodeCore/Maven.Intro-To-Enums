package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String name;

    public AliceBobEvaluator() {

    }

    public AliceBobEvaluator(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public boolean isAlice() {
        return name().equals("Alice");
    }

    public boolean isBob() {
        return name().equals("Bob");
    }
}
