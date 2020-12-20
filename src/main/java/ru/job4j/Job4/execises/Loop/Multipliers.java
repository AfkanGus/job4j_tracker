package ru.job4j.Job4.execises.Loop;

public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
/*
* 8. Вывести делители числа
Дано целое число n (> 0). Нужно вывести делители числа. Делитель это число на которое делится заданное число
* */