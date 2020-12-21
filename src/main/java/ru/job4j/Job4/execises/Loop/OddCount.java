package ru.job4j.Job4.execises.Loop;

public class OddCount {
    public static int count(int a, int b) {
        int s = 0;
        for (int i = a; i <= b; i++) {
           s += i %2 != 0 ? 1:0;
        }
        return s;
    }
}
/*
* 9.1. Найти количество нечетных в диапазоне
Даны два целых положительных числа a и b (b > a).
* Найти количество нечетных чисел в диапазоне [a, b].
*  Нечетным считается число, у которого остаток от делени
* я на 2 равен 1
* */