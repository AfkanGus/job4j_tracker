package ru.job4j.collection;

import java.util.Comparator;

/**
 * Отдельный класс с реализацией компонатора для сортирвоки элементов списка подразделений
 *
 * @author Guseynov Afkan
 * @version 1.0
 */
public class DepDescComp implements Comparator<String> {
    /**
     * Метод для сравнения элементов по убыванию
     *
     * @param o1 - первые элементы
     * @param o2 - последующие элементы
     * @return вернуть элементы в порядке убывания
     */
    @Override
    public int compare(String o1, String o2) {
        String[] str1 = o1.split("/");
        String[] str2 = o2.split("/");
        int rsl = str2[0].compareTo(str1[0]);
        if (rsl != 0) {
            return rsl;
        }
        return o1.compareTo(o2);
    }
}
