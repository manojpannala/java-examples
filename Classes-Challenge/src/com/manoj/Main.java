package com.manoj;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Bank Balance Challenge Classes***");
        System.out.println("");
        Bank account = new Bank();
        //account.withdrawal(100.0);

        System.out.println("Bank Account Balance:");

        account.deposit(200);
        account.withdrawal(150);
        System.out.println("");

        System.out.println("***VipCustomer Challenge Using Constructors***");
        System.out.println("");

        VipCustomer person1 = new VipCustomer();
        System.out.println("Person1 = " + person1.getName());

        VipCustomer person2 = new VipCustomer("Manoj",50000, "man@manoj.com");
        System.out.println("Person2 = " + person2.getName() + " " + person2.getCreditLimit() + " " + person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Sumaj" ,45000);
        System.out.println("Person3 = " + person3.getName() + " " + person3.getCreditLimit());
    }
}
