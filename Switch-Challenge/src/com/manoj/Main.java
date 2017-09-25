package com.manoj;

public class Main {

    public static void main(String[] args) {
	char switchValue = 'D';

	switch (switchValue) {
        case 'A':
            System.out.println("The letter is A");
            break;

        case 'B':
            System.out.println("The letter is B");
            break;

        case 'C': case 'D': case 'E':
            System.out.println("The letter is C or D or E");
            System.out.println("But the actual letter is " + switchValue);
            break;

        default:
            System.out.println("Not Found");
            break;
    }
    }
}
