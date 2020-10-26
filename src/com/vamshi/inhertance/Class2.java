package com.vamshi.inhertance;

public class Class2 extends Class1 {
    public void method27(){
        int i = 45;
        int p = 46;

        System.out.println("Class2 add method27 " + ( i + p));
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.method27();
        class2.mathod25();
        class2.method26();
        System.out.println("inheritance example");
    }
}

