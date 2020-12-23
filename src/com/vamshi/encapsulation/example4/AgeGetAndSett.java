package com.vamshi.encapsulation.example4;

public class AgeGetAndSett {
    public static void main(String[] args) {
        AgeAndName ageof = new AgeAndName();
        ageof.setAge(25);
        ageof.setName("Hello");
        System.out.println("name of " + ageof.getName());
        System.out.println("age of " + ageof.getAge());
    }
}
