package com.ugurinal;

public class HumanAndroid extends Android {

    public HumanAndroid(String model) {
        super(model);
    }

    @Override
    public String Move() {
        return "The human is Walking";
    }
}
