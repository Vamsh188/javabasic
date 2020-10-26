package com.vamshi.encapsulation.example3;

public class CityInfoTest {
    public static void main(String[] args) {
        CityInfo cinfo = new CityInfo();
        cinfo.setCityname("hyd");
        cinfo.setPopulation(25784.58f);
        cinfo.setSalary(300);
        cinfo.setZipcode(72712);

        System.out.println("city name " + cinfo.getCityname());
        System.out.println("city name " + cinfo.getPopulation());
        System.out.println("city name " + cinfo.getZipcode());
        System.out.println("city name " + cinfo.getSalary());

    }
}
