package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int prod = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                prod = i;
                break;
            }
        }
        return prod;
    }
}

