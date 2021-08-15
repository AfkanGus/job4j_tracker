package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2.2. Реализовать словарь.
 * Необходимо реализовать словарь. Метод принимает массив строк.
 * Нужно перебрать массив и добавить строки в карту так, чтобы
 * ключом был первый символ,а значением - список строк,начинающийся на первый символ
 * строки.
 */
public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String value = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(value, new ArrayList<>());
            rsl.get(value).add(string);
        }
        return rsl;
    }
}
