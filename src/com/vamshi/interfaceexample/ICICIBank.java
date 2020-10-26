package com.vamshi.interfaceexample;

public class ICICIBank implements Banks{
    
    public void deposit() {
        System.out.println("Icici Deposit 25 lks");
    }

    
    public void withdraw() {
        System.out.println("Icici bank withdraw only 10,000");
    }

    
    public void loan() {
        System.out.println("Icici bank loan gives $12,000");
    }

    
    public void interest() {
        System.out.println ( "Icici Bank charge 25%");
    }
}
