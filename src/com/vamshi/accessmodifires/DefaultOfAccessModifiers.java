package com.vamshi.accessmodifires;

public class DefaultOfAccessModifiers { // Example of AccessOfModifiers is class name

    void def (){   // we are not given access modifiers that mean's this is a default access modifiers

        int k = 25; // int k (variable ) mean's holding the 25 --> declared the value
        System.out.println(k); // here we are printing the " k " value
    }

    public static void main(String[] args) { // this is main method

        DefaultOfAccessModifiers ex = new DefaultOfAccessModifiers(); // here we are creating object using of class name

        ex.def(); // ex mean's ref of class

    }
}

//////---------------------------------------///

        // default is with in same package  //


//Default: The access level of a default modifier is only within the package
// It cannot be accessed from outside the package.
// If you do not specify any access level, it will be the default method


/////------------------------------------------//

