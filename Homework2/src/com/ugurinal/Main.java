package com.ugurinal;

/*
* ID: 2016555043
* Name: UGUR INAL
*/

public class Main {

    public static void main(String[] args) {

        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        int monthNum = (int)((Math.random() * 12) + 1);

        System.out.println("Random value is = " + monthNum + " --> " + months[monthNum - 1]);
    }
}
