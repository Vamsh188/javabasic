package com.vamshi.abstractclass;

public class Test {
    public static void main(String[] args) {


       //////   here read the points //////

      //  Bank bank = new Bank (); we can not create object for Bank bcz we are used abstract methods
        // so we need to create sub class

        IciciBank iciciBank = new IciciBank();
        HdfcBank hdfcBank = new HdfcBank();

        iciciBank.loan();
        iciciBank.interest();
        iciciBank.deposit();
        iciciBank.withdraw();

        hdfcBank.loan();
        hdfcBank.interest();
        hdfcBank.deposit();
        hdfcBank.withdraw();
    }
}
