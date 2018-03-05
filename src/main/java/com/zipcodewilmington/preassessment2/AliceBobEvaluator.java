package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator
{

    private String name;

    public AliceBobEvaluator(String name)
    {
        this.name = name;
    }

    public boolean isBob()
    {
        return this.name.equalsIgnoreCase("BOB");
    }

    public boolean isAlice() {
        return this.name.equalsIgnoreCase("ALICE");
    }



}
