package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = left.length() - right.length();
        for (int i = 0; i < left.length() && i < right.length(); i++) {
            if ((int) left.charAt(i) == (int) right.charAt(i)) {
                continue;
            } else {
                return (int) left.charAt(i) - (int) right.charAt(i);
            }
        }
        return rsl;
    }
}



