package com.vamshi.exampleofComposition;

public class Honda extends Bike {
    public void setStart(){
        HondaEngine e = new HondaEngine();
        e.start();
    }
}
