package com.chagas.anny.challenge1.entities;

public class Order {
    private int code;
    private double basic;
    private double discount;

    public Order() {
    }

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public double getBasic() {
        return basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
