package com.zipcodewilmington.preassessment2;

import java.util.Date;

public enum BirthDates {

    BIRTHDATE;

    public Date getValue(){
        return new Date(System.currentTimeMillis());

    }

}
