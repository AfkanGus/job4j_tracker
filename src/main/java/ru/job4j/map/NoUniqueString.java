package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.1. Массив строк с повторяющимися значениями.
 */

public class NoUniqueString {
    public static Map<String, Boolean> checkDat(String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        for (String string : strings) {
            rsl.computeIfPresent(string, (key, value) -> true);
            rsl.putIfAbsent(string, false);
        }

        return rsl;
    }
}
