package com.example.model;

public class Main {
    public static void main(String[] args) {
        Snack chips = new Snack("Potato Chips", 30, 1);
        Candy candy = new Candy("Geisha", 2, 2);
        Drink drink = new Drink("Coke", 15, 3);

        Product[] products = {chips, candy, drink};
        VendingMachineImplement vendingMachine = new VendingMachineImplement(products);
        vendingMachine.addCurrency(20);
        System.out.println("Balance: SEK" + vendingMachine.getBalance());

        String[] prodNames = vendingMachine.getProducts();
        for (int i = 0; i < prodNames.length; i++) {
            System.out.println("Product = " + prodNames[i]);
            System.out.println(vendingMachine.getDescription(i));
        }
        Product selectedProduct = vendingMachine.requestProduct(1);
        if (selectedProduct != null) {
            System.out.println("Purchased: " + selectedProduct.getProductName());
            System.out.println("Remaining balance: SEK" + vendingMachine.getBalance());

        }
        int change = vendingMachine.endSession();

        System.out.println("Change returned: SEK" + change);


    }
}

