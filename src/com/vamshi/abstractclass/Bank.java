package com.vamshi.abstractclass;

public abstract class Bank {
    public void deposit(){
        System.out.println("you can deposit upto 10 lakhs");
    }
    public void withdraw(){
        System.out.println("you can withdraw upto 5 lakhs");
    }
    abstract void loan();
    abstract void interest();

}
