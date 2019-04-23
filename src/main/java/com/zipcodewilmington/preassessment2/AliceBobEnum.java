package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

        ALICE("Hey, my name is ALICE!"),
        BOB("Hey, my name is BOB!");

        private String catchPhrase;

        AliceBobEnum(String catchPhrase) {
            this.catchPhrase = catchPhrase;
        }

        public String getCatchPhrase() {
            return catchPhrase;
        }

        public void setCatchPhrase(String catchPhrase) {
            this.catchPhrase = catchPhrase;
        }

        public boolean isAlice() {
            return (this.name().equals("ALICE"));
        }

        public boolean isBob() {
            return (this.name().equals("BOB"));
        }

}
