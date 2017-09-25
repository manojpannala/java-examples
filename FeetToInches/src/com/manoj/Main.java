package com.manoj;

public class Main {

    public static void main(String[] args) {

        calcFeetandInchestoCentimeters(6, 0);
        calcFeetandInchestoCentimeters(72);

    }

    public static double calcFeetandInchestoCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cms");

        return centimeters;

    }

    public static double calcFeetandInchestoCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and remaining inches = " + remainingInches + " inches");
        return calcFeetandInchestoCentimeters(feet, inches);
    }


}
