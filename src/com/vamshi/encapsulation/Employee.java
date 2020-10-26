package com.vamshi.encapsulation;

public class Employee {
    private int id;
    private float salary;
    private String address;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// (this mean's keyword ) this key word is used to call the current class reference data.