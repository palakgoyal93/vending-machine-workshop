package com.example.model;

class Drink extends Product {
    public Drink(String productNAme, double price, int id) {
        super(productNAme, price, id);
    }

    @Override
    public String examine() {
        return "This is a " + getProductName() + " snack.Price: SEK " + getPrice() + "Product is is: " + getId();
    }

    @Override
    public String use() {
        return "Feel refreshed with cold  " + getProductName() + " drink!";
    }
}
