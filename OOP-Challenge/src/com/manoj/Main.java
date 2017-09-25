package com.manoj;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Chicken","Italian",130.5);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",9.9);
        hamburger.addHamburgerAddition2("Lettuce",12.78);
        hamburger.addHamburgerAddition3("Cheese",10);
        hamburger.addHamburgerAddition4("Mayo",5.75);
        System.out.println("Total Burger Price is "+hamburger.itemizeHamburger());
    }
}
