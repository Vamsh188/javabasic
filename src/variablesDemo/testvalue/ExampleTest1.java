package variablesDemo.testvalue;

public class ExampleTest1 {
    int k= 25;
    int g= 26;


    static int u = 90;
    static  int y = 95;

    public void add(){
        int r = 26;
        int e = 30;
        int re = r + e;
        System.out.println(re);
    }

    public static void main(String[] args) {
        ExampleTest1 te = new ExampleTest1();
        int rg = te.g + te.k;
        System.out.println(rg);
        te.add();
        int uy = u+y;
        System.out.println(uy);

    }
}
