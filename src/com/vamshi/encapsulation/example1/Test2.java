package com.vamshi.encapsulation.example1;

public class Test2 {
    public static void main(String[] args) {
        MobileInfo mobileInfo = new MobileInfo();
        mobileInfo.setNetworkn("Idea");
        mobileInfo.setPhonenumber(961547825);
        mobileInfo.setPrice(25.68f);
        System.out.println("Mobile network " + mobileInfo.getNetwork());
        System.out.println("mobile number  " + mobileInfo.getPhonenumber());
        System.out.println("mobile price " + mobileInfo.getPrice());

    }

}
