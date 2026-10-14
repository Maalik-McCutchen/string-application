package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String item = "Apples";
        double priceItem = 2.37;
        int quantity = 3;
        double total = priceItem * quantity;

        System.out.println("You bought " + quantity + " " + item + "For $" + total);

    }
}
