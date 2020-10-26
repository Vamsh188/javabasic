package com.vamshi.encapsulation.example2;

public class CarTest {
    public static void main(String[] args) {
        Carinfo carinfo = new Carinfo();
        carinfo.setBrandname("Honda");
        carinfo.setMillage(255.36f);
        carinfo.setModel("civic");
        carinfo.setPrice(2587489222268l);
        System.out.println("Brand name of the car " + carinfo.getBrandname());
        System.out.println("Price of the car " + carinfo.getPrice());
        System.out.println("Millage of the car " + carinfo.getPrice());
        System.out.println("model of the car " + carinfo.getModel());

    }
}
