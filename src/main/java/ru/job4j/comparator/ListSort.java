package ru.job4j.comparator;

import java.util.*;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;

    }
}
