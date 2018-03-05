package com.zipcodewilmington.preassessment2;

public class Values <V> {

    private V values;

    public Values(V values){
        this.values = values;
    }

    public V getValue(){
        return this.values;
    }
}
