package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class BirthDate {

    private Date birthDate = null;

    public BirthDate(Date birthDate){
        this.birthDate = birthDate;
    }

    public Date getValue(){
        return this.birthDate;
    }
}
