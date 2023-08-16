package com.example.model;

public class VendingMachineImplement implements VendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImplement(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        depositPool += amount;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product requestProduct(int id) {
        if (id >= 0 && id < products.length && depositPool >= products[id].getPrice()) {
            depositPool -= products[id].getPrice();
            return products[id];
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override

    public String getDescription(int id) {
        if (id >= 0 && id < products.length) {
            return products[id].examine();
        }
        return "Invalid product id";
    }

    @Override
    public String[] getProducts() {
        String[] productsNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsNames[i] = products[i].getProductName();
        }
        return productsNames;
    }


}
