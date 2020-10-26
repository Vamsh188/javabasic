package com.vamshi.Exampleofwhile;

public class ExampleOfWhile {
    public void add(int x){
        int i =0;
        while (i<=x ){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {

    ExampleOfWhile exwhile = new ExampleOfWhile();
    exwhile.add(1);

    }

}

