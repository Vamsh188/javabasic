package com.vamshi.finalkey;

public class TestForSample1AndSample2 {
    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        sample2.shows();
    }
}

   // This is wont be run sample2 (sub class) bcz in sample1 we gave the name of method final so it won't we run
//    if you want to run this u should be remove the final key word