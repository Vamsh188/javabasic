package com.vamshi.overriding;

public class Test {
    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        sample2.show();
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