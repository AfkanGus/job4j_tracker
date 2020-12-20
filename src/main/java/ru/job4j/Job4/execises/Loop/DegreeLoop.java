package ru.job4j.Job4.execises.Loop;

import java.math.BigInteger;

public class DegreeLoop {
    public static int calculate(int a, int n) {

//1 способ.
        return (int) Math.pow(a, n);

    /* 2 Способ.
       int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= a;
            System.out.println(Math.pow(a, n));
        }
        return rsl;*/

      /*  3.Способ.
      //Если значение степени будет больше единицы, нас выброси назад
      if (n == 1) {
            return a;
        } else {//Сам мехонизм умножения a на результат вызова
        //этого же метоно но с calculate(a, n - 1);
            return a * calculate(a, n - 1);
        }*/

      /*  4.Способ с помошью BigInteger
      BigInteger rsl = new BigInteger(String.valueOf(a));
        return rsl.pow(n).intValue();*/
    }
}

/*
* 7. Найти степень числа
Дано целое число a и целое число degree (> 0). Найти a в степени degree: a^degree = a·a· . . . ·a (числа a перемножаются degree раз).
*/