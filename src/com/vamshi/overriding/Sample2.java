package com.vamshi.overriding;

public class Sample2 extends Sample1 {
    public void show(){
        // super.show();
        System.out.println("sub class functionality");
}
}
// super is key word
// super.show --> if we didn't give this one, the class should be run only sub class


// note

// Method overriding -

//Same method name with same number of arguments in super class and subclass.
//- if you don't have method in sub class, by defaults super class method will be executed.
//==> when ever we are having same method name with same number of argumnets in super class and subclass,
// by default subclass method will be executed.
//-> if you want to execute super class method also, we need to call by using super keyword