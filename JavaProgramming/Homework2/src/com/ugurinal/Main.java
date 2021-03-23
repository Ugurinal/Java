package com.ugurinal;

public class Main {
    public static void main(String[] args) {

        Android[] _myArray = new Android[2];

        _myArray[0] = new DogDroid("Husky");
        _myArray[1] = new HumanAndroid("Man");

        System.out.println("The " + _myArray[0].GetModel() + " dog android model is moving: " + _myArray[0].Move());
        System.out.println("The " + _myArray[1].GetModel() + " human android model is moving: " + _myArray[1].Move());
    }
}
