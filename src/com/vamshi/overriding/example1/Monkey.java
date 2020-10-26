package com.vamshi.overriding.example1;

public class Monkey extends Dog{
    void Sound(){
            super.Sound();
            System.out.println("Monkey says hehehe");
    }
}
