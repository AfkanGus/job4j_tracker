package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Map<String, Integer> originWordsMap = new HashMap<>();

        /* Создаем карту слов из оригинального текста*/
        String[] originWords = origin.split("\\s+");
        for (String word : originWords) {
            String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                originWordsMap.put(cleanedWord, originWordsMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        /* Проверяем, что каждое слово в новом тексте присутствует в оригинальном тексте*/
        String[] lineWords = line.split("\\s+");
        for (String word : lineWords) {
            String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                if (!originWordsMap
                        .containsKey(cleanedWord) || originWordsMap.get(cleanedWord) == 0) {
                    return false;
                }
                originWordsMap.put(cleanedWord, originWordsMap.get(cleanedWord) - 1);
            }
        }
        return true;
    }
}


