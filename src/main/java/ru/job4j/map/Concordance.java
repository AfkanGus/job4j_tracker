package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2.3 Индекс симоволов
 * Метод принимает строку, при этом слова могут содержать как строчные символы,
 * так и прописные.
 * При реализации необходимо игнорировать пробелы во входной строке.
 * Реализовать метод который вернет отоборажение, в котором ключом будет символ
 * из строки,а значением - список индексов, под которыми этот симов( елси таких симовлов
 * несколько) входит в искодную строку.
 * Строчные и прописне симвоы считаются разными смиволами.
 */
public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        //Игнорируем пробелы во входной строке
        s = s.replaceAll("\\s+", "");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            rsl.putIfAbsent(chars[i], new ArrayList<>());
            rsl.get(chars[i]).add(i);
        }
        return rsl;
    }
}

