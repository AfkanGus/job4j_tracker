package ru.job4j.collection;

import java.util.*;

/**
 * Реализация класса,который добовляет и сортирует пропущенные подразделения в справочнике.
 *
 * @author Guseynov Afkan
 * @version 1.0
 */
public class Departments {
    /**
     * Метод в качетве параметра принимает список из подразделений
     *
     * @param deps - список подразделений
     * @return - вернуть массив одиночных элементов
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.equals("") ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * @param orgs - остортированный список по  возрастанию(Comparator.naturalOrder())
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    /**
     * @param orgs - отсортированный список по убыванию
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
