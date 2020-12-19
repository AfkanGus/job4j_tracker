package ru.job4j.Job4.execises.Loop;

public class SweetPrice {
    public static void out(int price) {
        for (int index = 1; index <= 5; index++) {
            System.out.println(index * price);
        }

    }
}
/*
 *  Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.
 * */