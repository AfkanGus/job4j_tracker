package ru.job4j.Job4.execises.Loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 1;
        for (int i = 1; i < num; i++) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
        /*  return num >= 10 ? num % 10 + sum(num / 10) : num;*/

       /* int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }*/
    }
}
/*
* 9.5. Сумма цифр
Дано число, нужно получить сумму его цифр
Например,
12 => 1 + 2 => 3
* */