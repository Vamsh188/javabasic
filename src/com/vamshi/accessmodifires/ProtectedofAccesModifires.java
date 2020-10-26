package com.vamshi.accessmodifires;

public class ProtectedofAccesModifires {
protected  void Pro(){
    int p = 25;
}

    public static void main(String[] args) {
        ProtectedofAccesModifires pr = new ProtectedofAccesModifires();
        pr.Pro();
}
}


///////// Protected ///////////

  //  --  with in all package --//

//Protected: The access level of a protected modifier is within the package and outside the package through child class.
//  If you do not make the child class, it cannot be accessed from outside the package.