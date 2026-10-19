package com.fernando.order.entities;

public class Order {
    private int id;
    private Double basic;
    private Double discount;

    public Order(int id, Double basic, Double discount) {
        this.id = id;
        this.basic = basic;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
