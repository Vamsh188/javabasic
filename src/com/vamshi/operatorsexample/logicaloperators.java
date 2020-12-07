package com.vamshi.operatorsexample;

public class logicaloperators {
    public static void main(String[] args) {

        int score = 80; //a
        boolean isSunny = true; //b
//        if (!isSunny);
//        System.out.println("please don't play in outside");

//        int score = 80;
//        boolean isSunny = false;
//
        if (score > 92 || isSunny) {
            System.out.println("yes you can please");
        } else {
            System.out.println("please don't play in outside");
        }

//        if (score > 90 && isSunny){
//            System.out.println("you can play");
//        }
//         else {
//            System.out.println("please don't go outside");
//        }


    }
}

//        Operator  example   Description
//        &&        a&&b      Logical AND :true if both a and b are true
//
//        ||        a||b      Logical OR :true if either a or b is true
//
//        !          !a       Local Not: True if a is false,or false if a true