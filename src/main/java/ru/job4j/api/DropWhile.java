package ru.job4j.api;

import java.util.List;

/**
 * Stream.dropWhile - метод позволяет получить поток данных после того, как условие стало ложным
 * Когда обрабатывается число 3 условие v -> v < 3 становится "истина".
 * Все дальнейшие элементы проходят дальше.
 */
public class DropWhile {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4).stream()
                .dropWhile(v -> v < 3)
                .map(v -> "Result: " + v)
                .forEach(System.out::println);
    }
}
