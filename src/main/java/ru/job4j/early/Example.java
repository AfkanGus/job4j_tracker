package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Принципы раннего возврата и охранных выражений [#504875].
 * Суть принципа раннего возврата - если результат известен, то его нужно возвращать сразу.
 * Причем возврат != return. Под возвратом подразумевается выход из метода,
 * поэтому это может быть как return, так и throw.
 */
public class Example {
    private static final double COMPARING_PRECISION = 1.e-5;

    /*
    функцию calculateInverseProportionality(), в которой приведен пример нарушения принципов.
    - слишком большая вложенность => код громоздкий,
     нужно удерживать в голове, какие условия Вы проверили.
      Это особенно не удобно при отладке, т.к. придется смотреть вверх вдоль верхних if.
      такой код будет слишком тяжело тестировать.
      Не очевидны кейсы (ситуации), которые обрабатывает метод.
     */
    private static List<Double> calculateInverseProportionality(double k, double x1,
                                                                double x2, int n) {
        if (!isEquals(k, 0)) {
            if (n > 0) {
                if (k > 0 && x1 < x2) {
                    return calculateFunction(k, x1, x2, n);
                } else if (k < 0 && x2 < x1) {
                    return calculateFunction(k, x2, x1, n);
                } else if (isEquals(x1, x2)) {
                    if (n == 1) {
                        return List.of(k / x1);
                    } else {
                        throw new IllegalArgumentException("n suppose more than one point,"
                                + " but range include one point");
                    }
                } else {
                    throw new IllegalArgumentException("k is not consistent with x1 and x2");
                }
            } else {
                throw new IllegalArgumentException("'n' must be more than 0");
            }
        } else {
            throw new IllegalArgumentException("'k' must be more than 0");
        }
    }

    private static boolean isEquals(double a, double b) {
        return Math.abs(a - b) < COMPARING_PRECISION;
    }

    private static List<Double> calculateFunction(double k, double x1,
                                                  double x2, int n) {
        List<Double> result = new ArrayList<>(n);
        double step = (x2 - x1) / n;
        for (int i = 0; i < n; i++) {
            double xi = x1 + i * step;
            double yi = k / xi;
            result.add(yi);
        }
        return result;
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(calculateFunction(1, 2, 3, 4));
        System.out.println(isEquals(1.2, 2.2));
        System.out.println(calculateInverseProportionality(4, 2, 3, 4));
    }
}
