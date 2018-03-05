package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE, BOB; //enums

    public String getCatchPhrase() { //Get catchphrase for each name, in this case the phrases are the same
        return ("Hey, my name is " + name() + "!");
    }

    public String setCatchPhrase(String catchPhrase) { //Setting catch phrase for each person
        BOB.setCatchPhrase("Hey, my name is BOB!");
        ALICE.setCatchPhrase("Hey, my name is ALICE!");
        if (catchPhrase.equals(isAlice())){
            return ALICE.getCatchPhrase();
        }else{
            return BOB.getCatchPhrase();
        }
    }

        public boolean isAlice() {
            return name().equals("ALICE");
        }

        public boolean isBob() {
            return name().equals("BOB");
        }
    }
