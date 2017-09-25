package com.manoj;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is from 2% to 9% interest rate");
        System.out.println("***");
        for (int i = 2; i < 10; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
        System.out.println("***");
        System.out.println(" ");
        System.out.println("This is from 9% to 2% interest rate");
        System.out.println("***");
        for (int i = 9; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
        System.out.println(" ");
        System.out.println("Checking the prime number challenge");

        int count = 0;
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 5) {
                    System.out.println("Exiting the for loop");
                    break;
                }
            }

        }

    }

//    Prime Number method code

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // We can also use this but not so optimised loop --> for (int i = 2; i <= n / 2; i++)

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
