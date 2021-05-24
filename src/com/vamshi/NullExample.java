package com.vamshi;

public class NullExample {

    public static void main(String[] args) {
        String r = new String("Vamshi");
        System.out.println(r==null);

        String s = null;
        System.out.println(s==null);

        String b = new String("haha");// for any obejct refrence b, b.equals (null) is always false.
        System.out.println(b.equals(null));

        String u = "";
        System.out.println(u.length()); //null and empty String ("")both are not equal.

        String t = null;
        System.out.println((String)null);
        System.out.println(t);

    }
}
