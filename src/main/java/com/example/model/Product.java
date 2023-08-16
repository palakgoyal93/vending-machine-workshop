package com.example.model;

abstract class Product {
    private String productName;
    private double price;
    private int id;

    //constructor
    public Product(String productName, double price, int id) {
        this.productName = productName;
        this.price = price;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public abstract String examine();

    public abstract String use();
}

