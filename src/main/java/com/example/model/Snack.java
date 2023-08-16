package com.example.model;

class Snack extends Product {
    public Snack(String productName, double price, int id) {
        super(productName, price, id);
    }

    @Override
    public String examine() {
        return "This is a " + getProductName() + " snack.Price: SEK " + getPrice() + "Product is is: " + getId();
    }

    @Override
    public String use() {
        return "Enjoy your " + getProductName() + " snack!";
    }
}
