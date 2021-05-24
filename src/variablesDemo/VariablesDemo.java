package variablesDemo;

public class VariablesDemo {
    int g = 25; //instance variable
    int j = 35; //instance variable
    static int x =36; // static variable
    static int y = 20; // static variable


    public void add () {
        int e = 25; // local variable
        int t = 26; // local variable//
        int u = e+t;
        System.out.println(u);
    }
//

    public static void main(String[] args) {
        VariablesDemo vd = new VariablesDemo ();
        vd.add();
        int r = vd.g+ vd.j;// vd mean's object (when we are use instance variable we should call object before u called variable)
        System.out.println("instance variable r = " + r);
        int q = x + y; // we don't need call object bcz here we use static variable so we can call directly to variable
        System.out.println(q);


    }

}
