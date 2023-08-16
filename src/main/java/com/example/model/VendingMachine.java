package com.example.model;

public interface VendingMachine {
    void addCurrency(int amount);

    int getBalance();

    Product requestProduct(int id);

    int endSession();

    String getDescription(int id);

    String[] getProducts();
}
