package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet";

        Map<String, Integer> wordFrequencyMap = countWordFrequency(text);
        /* Выводим результаты*/
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        /* Разделяем текст на отдельные слова*/
        String[] words = text.split("\\s+");

        /* Подсчитываем частоту встречаемости слов
         */
        for (String word : words) {

            /*Удаляем все символы, кроме букв, из слова*/

            String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
            cleanedWord.toLowerCase();

            if (!cleanedWord.isEmpty()) {
                /*Обновляем частоту встречаемости слова в карте*/
                wordFrequencyMap.put(cleanedWord,
                        wordFrequencyMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        return wordFrequencyMap;
    }
}
