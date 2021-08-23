package ru.job4j.comparator;
/*
2.1 Иногда бывает нужно отсортировать массив. Для этого есть метод
void Arrays.sort(массив),
который сортирует примитивы в восходящем порядке.
Например.
int[] data = {3,2,1};
Arrays.sort(data); // => {1,2,3};
Ваша задача отсортировать переданный массив и вернуть его.
 */

import java.util.Arrays;

public class ArraysSort {
    public static long[] sort(long[] data) {
        Arrays.sort(data);
        return data;
    }
}
