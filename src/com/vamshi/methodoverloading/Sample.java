package com.vamshi.methodoverloading;

public class Sample {
    public void add (){
        System.out.println("here enter the value of method overloading ");
    }
    public void add (int a){
        System.out.println("a value is : " + a);

    }
    public void add (int a,int b){
        int c = a+b;
        System.out.println(" a + b value = c " + c);

    }
    public void add (float a,float b){
        float k = a + b;
        System.out.println(" here add the float values k " + k );
    }


}

// overloading is same method name and same or different arguments
// overloading is same method name and same or different arguments with different data types