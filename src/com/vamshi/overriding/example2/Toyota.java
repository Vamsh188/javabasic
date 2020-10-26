package com.vamshi.overriding.example2;

public class Toyota extends Honda{
    public void TestDrive(){
        super.TestDrive();
        System.out.println("nice car");
    }
}
