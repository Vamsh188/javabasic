package com.vamshi.string;

public class ExampleofString {
    public static void main(String[] args) {
        String s1 = "Vamshi"; //s1 is the string value
        System.out.println(s1);
        s1.concat("java");
       // System.out.println(s1); // String is immutable that's what it's not printing the "java" --> it wont be work concating
        String s2 = s1.concat( "java"); //if we want to do any modification, compulory we need to create a new object.here String s2 mean's new object
        System.out.println(s2);

                }
}
