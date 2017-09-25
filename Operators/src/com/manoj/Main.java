package com.manoj;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double myFirstValue = 20d;
        double mySecondValue = 80d;

        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("mytotal = "+ myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder = "+ theRemainder);
        if(theRemainder<=20)
            System.out.println("Total was over the limit");




    }
}
