package com.vamshi.aggregationexample;

public class AddressAggregation {
    static class Address
    {
        int streetNum;
        String city;
        String state;
        String country;
        Address(int street, String c, String st, String coun)
        {
            this.streetNum=street;
            this.city =c;
            this.state = st;
            this.country = coun;
        }
    }
    static class StudentClass
    {
        int rollNum;
        String studentName;
        Address studentAddr;
//        String k = "college";
        StudentClass(int roll, String name, Address addr){
            this.rollNum=roll;
            this.studentName=name;
            this.studentAddr = addr;
//            this.k = "kmdc";

        }
        public static void main(String args[]){
            Address ad = new Address (55, "HYD", "AP", "India");
            StudentClass obj = new StudentClass(123, "Chaitanya", ad);
            System.out.println(obj.rollNum);
            System.out.println(obj.studentName);
            System.out.println(obj.studentAddr.streetNum);
            System.out.println(obj.studentAddr.city);
            System.out.println(obj.studentAddr.state);
            System.out.println(obj.studentAddr.country);
        }
    }
}
