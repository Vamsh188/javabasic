package com.vamshi.interfaceexample;

public class Test {
    public static void main(String[] args) {
        ICICIBank ibank= new ICICIBank();
        ibank.deposit();
        ibank.withdraw();
        ibank.interest();
        ibank.loan();

        HdfcBank hbank = new HdfcBank();
        hbank.deposit();
        hbank.interest();
        hbank.loan();
        hbank.withdraw();
    }
}
