package com.vamshi.exampleofComposition;

public class Bike {
    private String color;//variable is not declared
      int wheels;

    public void bikeFeatures() {
        System.out.println("\"Bike Color= \"+color + \" wheels= \" + wheels");
    }
    public void setColor(String color){
        this.color = color;
    }

     public void setwheels(int wheels){
        this.wheels = wheels;
}
}
