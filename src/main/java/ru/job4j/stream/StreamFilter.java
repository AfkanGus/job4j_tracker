package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 0. Stream API [#58166]
 * Класс вывода на консоль поток данных в виде положительных чисел.
 *
 * @param - переменная number - массив донных чисел
 * @param - number.stream() -получаем поток элементов из ArrayList
 * @param - filter(n -> n > 0) - элементы передаем в filter(),if return true,
 *          то элемент передается дальше.
 * @param - collect(Collectors.toList()) - получнный результат сохраняется в List<Inter> filter
 * @param - forEach - принимает значения элементов на печать.
 */
public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(-20, -10, 10, 20));
        List<Integer> filter = number.stream().filter(n -> n > 0).collect(Collectors.toList());
        filter.forEach(System.out::println);
    }
}
