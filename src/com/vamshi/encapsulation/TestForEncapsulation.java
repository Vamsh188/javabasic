package com.vamshi.encapsulation;

public class TestForEncapsulation {
    public static void main(String[] args) {
       Employee em = new Employee();
       em.setId (455);
       em.setName("Vamshi");
       em.setSalary(25.5f);
       em.setAddress("hyd");

        System.out.println("employee id + " + em.getId());
        System.out.println("employee name + " + em.getName());
        System.out.println("employee salary  " + em.getSalary());
        System.out.println("employee address " + em.getAddress());
    }
}

