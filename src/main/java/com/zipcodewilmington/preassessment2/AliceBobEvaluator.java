package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String name;

//    AliceBobEvaluator (){};

    AliceBobEvaluator(String name){
        this.name = name;
    }
    public boolean isAlice(){
        if (name == "Alice"){
            return true;
        }
        return false;
    }

    public boolean isBob(){
        if (name == "Bob"){
            return true;
        }
        return false;
    }

}
