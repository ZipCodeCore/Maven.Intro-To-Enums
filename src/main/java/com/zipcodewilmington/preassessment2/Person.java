package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {

    public Data<String> name;
    public Data<Integer> age;
    public Data<Date> birthDate;

    public Person(String name, int age, Date birthDate){
        this.name = new Data(name);
        this.age = new Data (age);
        this.birthDate = new Data (birthDate);

    }

    public class Data <T>{
        T value;
        public Data(T input){
            this.value =  input;
        }

        public T getValue(){
            return this.value;
        }

    }

}
