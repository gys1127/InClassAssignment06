package com.android.carinfo;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private boolean suv;
    private String type;

    public Car(String brand, boolean suv, String type) {
        this.brand = brand;
        this.suv = suv;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSuv() {
        return suv;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nSUV: " + suv + "\nType: " + type;
    }
}
