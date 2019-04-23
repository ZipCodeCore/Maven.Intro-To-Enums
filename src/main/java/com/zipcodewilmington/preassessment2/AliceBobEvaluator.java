package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String input;

    public AliceBobEvaluator(String input) {
    this.input = input;
    }
    public Boolean isAlice(){
        return input.equalsIgnoreCase(AliceBobEnum.ALICE.name());
    }
    public Boolean isBob(){
        return input.equalsIgnoreCase(AliceBobEnum.BOB.name());
    }
}
