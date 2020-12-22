package ru.job4j.Job4.execises.Loop;

public class SecondSum {
    public static int sum(int a, int b) {
        /*3Спасоб*/
        int sum = 0;
        do {
            sum += a;
            a += 2;
        }
        while (a <= b);
        return sum;
        /* 2Способ
       int sum = 0;
        while (a <= b) {
            sum += a;
            a += 2;
        }
        return sum;*/

        /* 1Способ
        int sum = 0;
        for (int i = a; i <= b; i+=2) {
            sum +=i;
            }return sum;*/
    }
}
/*
* 9.2. Найти сумму каждого второго числа в диапазоне
Даны два целых положительных числа a и b (b > a).
* Надо сложить каждое второе число в диапазоне [a, b]
* начиная с первого
Например,
[1, 2] => 1

[1, 3] => 1 + 3 = 4

[1, 5] => 1 + 3 + 5 = 9

[0, 5] => 0 + 2 + 4 + 6 = 12*/