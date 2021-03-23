package com.ugurinal;

public class Android {
    private final String _model;
    private String _owner;

    protected Android(String model){
        _model = model;
    }

    public String GetModel() {
        return _model;
    }

    public String GetOwner() {
        return _owner;
    }

    public void SetOwner(String owner){
        _owner = owner;
    }

    public String Move(){
        return "The " + _model + " android model is moving: The android is moving";
    }
}
