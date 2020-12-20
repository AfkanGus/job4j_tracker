package ru.job4j.Job4.execises.Loop;

public class MultiplicationLoop {
    public static int multi(int a, int b) {
        int sum = 1;
        for (int index = a; index <= b; index++) {
            sum *= index;
            System.out.println(sum);
        }
        return sum;
    }
}



/*
* 6. Произведение чисел в диапазоне
Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
* */