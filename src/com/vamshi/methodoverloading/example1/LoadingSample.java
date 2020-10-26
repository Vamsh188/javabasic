package com.vamshi.methodoverloading.example1;

public class LoadingSample {
    public void adk(){
        System.out.println("only one");
    }
    public void adk(int k){
        System.out.println(k);
    }
    public void adk(int w , int q){
        int e = w+q;
        System.out.println(e);
    }
}
