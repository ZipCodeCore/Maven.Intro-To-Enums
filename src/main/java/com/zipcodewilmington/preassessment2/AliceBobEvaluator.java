package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String name;

    public AliceBobEvaluator(String someInput) {
        this.name = someInput;
    }

    public boolean isAlice() {
        if (this.name.equalsIgnoreCase("alice")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob() {
        if (this.name.equalsIgnoreCase("bob")) {
            return true;
        } else {
            return false;
        }
    }


}
