package ru.job4j.api;

import java.util.List;

/**
 * Stream.takeWhile - метод позволяет получить поток данных до тех пор
 * пока условие истина
 * Когда поток обрабатывает число 3 условие принимает значение "ложь" и поток данных завершается.
 *
 * Эту конструкцию удобно использовать с отсортированными данными.
 */

public class TakeWhile {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4).stream()
                .takeWhile(v -> v < 3)
                .map(v -> "Result: " + v)
                .forEach(System.out::println);
    }
}
