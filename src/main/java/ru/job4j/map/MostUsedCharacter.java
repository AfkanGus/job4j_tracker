package ru.job4j.map;

import java.util.*;

/**
 * 1.7. Найти символ который используется в строке наибольшее количество раз
 */
public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> character = new TreeMap<>();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (char st : chars) {
            character.computeIfPresent(st, (key, value) -> value + 1);
            character.putIfAbsent(st, 1);
        }
        char rsl = ' ';
        int count = 0;
        for (char key : character.keySet()) {
            if (character.get(key) > count) {
                rsl = key;
                count = character.get(key);
            }
        }
        return rsl;
    }
}
