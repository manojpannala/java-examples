package com.manoj;

public class Main {

    public static void main(String[] args) {
        int num = 5;
        int finishNum = 20;
        while (num <= finishNum) {
            if ((!isEvenNumber(num))) {
                num++;
                continue;
            }
            System.out.println("Even number = " + num);
            num++;
        }
    }

    public static boolean isEvenNumber(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
