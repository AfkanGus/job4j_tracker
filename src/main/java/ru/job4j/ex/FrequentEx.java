package ru.job4j.ex;

public class FrequentEx {
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int i = 0; i < shops.length; i++) {
            System.out.println(shops[i]);
        }
    }
}
/*
 * Мы помним, что последний элемент в массиве на 3 элемента будет 2,
 * так как индексы начинаются с элемента 0. Это значит, что условие
 * должно быть без включения последнего элемента.*/