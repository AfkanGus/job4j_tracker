package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char sourse = left.charAt(i);
            char compared = right.charAt(i);
            if (sourse != compared) {
                rsl = Character.compare(left.charAt(i), right.charAt(i));
                break;
            }
        }
        if (rsl == 0) {
            return Integer.compare(left.length(), right.length());
        }
        return rsl;
    }
}


