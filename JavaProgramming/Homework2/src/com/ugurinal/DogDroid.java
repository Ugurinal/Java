package com.ugurinal;

import java.lang.Cloneable;

public class DogDroid extends Android implements Cloneable {

    public DogDroid(String model) {
        super(model);
    }

    @Override
    public String Move() {
        return "The dog is Running";
    }
}
