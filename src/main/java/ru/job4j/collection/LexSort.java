package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] sourse = left.split("\\.");
        String[] compared = right.split("\\.");
        int one = Integer.parseInt(sourse[0]);
        int two = Integer.parseInt(compared[0]);
        return Integer.compare(one, two);
    }
}
