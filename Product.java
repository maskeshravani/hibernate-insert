package com.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int id;
    private String pname;
    private double price;
    private String color;
    private String cname;

    public Product() {
    	
    }

    public Product(int id, String pname, double price, String color, String cname) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.color = color;
        this.cname = cname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", pname=" + pname + ", price=" + price + ", color=" + color + ", cname=" + cname + "]";
    }
}
