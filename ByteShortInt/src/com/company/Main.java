package com.company;

public class Main {

    public static void main(String[] args) {

byte byteValue = 10;
short shortValue = 20;
int intValue = 50;

long longTotal = 50000L + 10L * (byteValue+shortValue+intValue);
short longTotal2 = (short)(1000 +10 * (byteValue+shortValue+intValue));
        System.out.println("Result of the longTotal is " + longTotal);         System.out.println("Result of the short is " + longTotal2);

    }
}
