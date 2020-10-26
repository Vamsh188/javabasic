package com.vamshi.test;

public class Sample {
    int k = 25;
    int f = 26;

    static int gh = 25;
    static int hy = 26;

    public void method1(){
        int t = 80;
        int y = 90;
        int ky = t+y;
        System.out.println("local variable "+ ky);
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.method1();
        int kf = sample.f+ sample.k;
        System.out.println(kf);
        int gy = gh+hy;
        System.out.println(gy);

}
}
