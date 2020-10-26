package com.vamshi.methodoverloading;

public class Test {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.add();
        sample.add(25);
        sample.add(25,26);
        sample.add(28.87f,89.6f);
    }
}

// overloading is same method name and some or different arguments
// overloading is same method name and some or different arguments with different data types