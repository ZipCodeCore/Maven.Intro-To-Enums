package com.zipcodewilmington.preassessment2;

import com.sun.tools.javac.jvm.Gen;

import java.util.Date;

public class GenericIdentity<E> {

    private E identity;

    public GenericIdentity(E identity){
        this.identity=identity;
    }

    public E getValue(){
        return identity;
    }
}
