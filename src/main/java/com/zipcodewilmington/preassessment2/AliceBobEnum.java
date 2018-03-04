package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE("Hey, my name is ALICE!"),
    BOB("Hey, my name is BOB!");


    String catchPhrase;


    AliceBobEnum(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }


    public String getCatchPhrase() {

        return catchPhrase;
    }

    public boolean isAlice() {
        if (this.name().toString().equals("ALICE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob() {
        if (this.name().toString().equals("BOB")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


