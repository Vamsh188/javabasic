package com.vamshi.encapsulation.example2;

public class Carinfo {

    public String getBrandname()
    {
        return Brandname;
    }

    public void setBrandname(String brandname) {
        Brandname = brandname;
    }

    public float getMillage() {
        return millage;
    }

    public void setMillage(float millage) {
        this.millage = millage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    private String Brandname;
    private float millage;
    private String model;
    private long price;


}
