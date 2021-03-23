package com.ugurinal;

import java.lang.Cloneable;

public class DogAndroid extends Android implements Cloneable {

    public DogAndroid(String model) {
        super(model);
    }

    @Override
    public String Move() {
        return "The dog is Running";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
