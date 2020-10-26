package com.vamshi.overriding.example1;

public class Dog extends Animal{
   void Sound(){
     super.Sound();
        System.out.println("dog says bow bow");
   }
}
