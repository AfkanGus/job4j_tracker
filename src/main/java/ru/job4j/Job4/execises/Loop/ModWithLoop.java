package ru.job4j.Job4.execises.Loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int div = n;
        while (n -d>=0) {
            n -= d;
        }
        return n;
    }
}
/*
* 9.4. mod через while
Есть операция остаток от деления %.
*  Вам даны два целых положительных числа числа n и d (d > 0).
* n это делимое, d это делитель. Вам нужно не используя операцию %,
* найти остаток от деления.
* Однако имейте в виду, что все,
* что делает деление, - это повторное вычитание.

*/