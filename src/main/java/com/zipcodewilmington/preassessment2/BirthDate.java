package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class BirthDate implements GenericPerson {
    Date birthDate;

    public BirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getValue() {
        return this.birthDate;
    }
}
