package com.vamshi.inhertance;

public class ClassB extends ClassA {
    public void method4(){
        System.out.println(" Class B method 4");
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.method4();
        b.method1();
        b.method2();
        b.method3();

    }
}
