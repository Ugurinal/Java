package com.ugurinal;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Android[] androids = new Android[2];

        androids[0] = new DogAndroid("Husky");
        androids[1] = new HumanAndroid("Man");

        System.out.println("The " + androids[0].GetModel() + " dog android model is moving: " + androids[0].Move());
        System.out.println("The " + androids[1].GetModel() + " human android model is moving: " + androids[1].Move());

        DogAndroid dogAndroidClone = (DogAndroid)((DogAndroid)androids[0]).clone();

        System.out.println("\nThe " + dogAndroidClone.GetModel() + " dog android model is moving: " + dogAndroidClone.Move());

    }
}
