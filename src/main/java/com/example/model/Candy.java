package com.example.model;

class Candy extends Product {
    public Candy(String productName, double price, int id) {
        super(productName, price, id);
    }

    @Override
    public String examine() {
        return "This is a " + getProductName() + " candy.Price: SEK " + getPrice() + "Product is is: " + getId();
    }

    @Override
    public String use() {
        return "Love the pure flavour of " + getProductName() + " candy!";

    }
}
