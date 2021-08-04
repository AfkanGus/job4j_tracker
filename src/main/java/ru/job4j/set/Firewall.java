package ru.job4j.set;

import java.util.Set;

/**
 * 0.4 Собственный файурволл
 */
public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] str = s.split(" ");
        for (String string : str) {
            if (words.contains(string)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
