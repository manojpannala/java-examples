package com.manoj;

public class Main {

    public static void main(String[] args) {


        System.out.println("I have given my weight which is around 106kgs ");
        System.out.println("--");
        System.out.println("**Weight Converter**");

        //Pounds to Kilograms
        double numPounds = 233.68981244474531d;
        double toKG = numPounds * 0.45359273d;
        System.out.println("Pounds to Kilograms = " + toKG);

        //Kilograms to Pounds
        double numKG = 106d;
        double toPounds = numKG / 0.45359273d;
        System.out.println("Kilograms to Pounds = " + toPounds);
    }
}
