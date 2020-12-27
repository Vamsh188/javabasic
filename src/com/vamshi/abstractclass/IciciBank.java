package com.vamshi.abstractclass;

public class IciciBank extends Bank {

    public void loan() {   // --> this method is implemented from Bank class bcz we need to create abstract class or implemented

       System.out.println("Icic Bank Loan upto 8 lakhs");
    }
   public void interest() {  // --> this method is implemented from Bank class bcz we need to create abstract class or implemented

        System.out.println("Icic Bank interest upto 5 lakhs");
    }
}
