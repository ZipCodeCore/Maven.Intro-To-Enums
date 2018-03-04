package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }


    public boolean isAlice() {
        if (input.equalsIgnoreCase("Alice")) {
            return true;
        } else {
            return false;
        }

    }

        public boolean isBob () {
            if (input.equalsIgnoreCase("Bob")) {
                return true;
            } else {
                return false;

            }
        }
    }

