package com.ugurinal;

public class Main {

    public static void main(String[] args) {
	    Android[] _myArray = new Android[2];

		_myArray[0] = new DogDroid("Husky");
	    _myArray[1] = new HumanAndroid("Man");

		for (Android android : _myArray) {
			System.out.println(android.Move());
		}
    }

}
