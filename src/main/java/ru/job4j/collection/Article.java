package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        /*originWordsMap - это Map<String, Integer>,
         где ключом является слово из оригинального текста,
         а значением - количество вхождений этого слова.
         */
        Map<String, Integer> originWordsMap = new HashMap<>();
        /* Создаем карту слов из оригинального текста*/
        String[] originWords = origin.split("\\s+");
        for (String word : originWords) {
            String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]",
                    "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                /*
                put Добовляет ключ - cleanedWord -очищенное и приведенное к
                нижнему регистру слово из оригинального текста. в мап.
                 */
                originWordsMap.put(cleanedWord,
                        /*
 этот метод получает значение, связанное с ключом cleanedWord из originWordsMap
  Если ключ cleanedWord отсутствует в карте, то возвращается значение по умолчанию - 0;
   Если ключ cleanedWord присутствует в карте, то возвращается связанное с ним значение.
   после получения значения из карты, к нему добавляется 1. Таким образом,
    мы увеличиваем счетчик вхождений слова cleanedWord в оригинальном тексте.
    Если слово cleanedWord не было ранее добавлено в originWordsMap,
     то при вызове метода originWordsMap.put(cleanedWord,
      originWordsMap.getOrDefault(cleanedWord, 0) + 1); оно будет добавлено в карту со значением,
       равным 1. Это означает, что у данного слова будет одно вхождение в оригинальном тексте.
                         */
                        originWordsMap.getOrDefault(cleanedWord, 0) + 1);
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


