package com.ugurinal;

import java.lang.Cloneable;

public class DogDroid extends Android implements Cloneable {

    public DogDroid(String model) {
        super(model);
    }

    @Override
    public String Move() {
        return "The " + super.GetModel() + " dog android model is moving: The dog is Running";
    }
}
