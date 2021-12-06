package ru.job4j.api;

import java.util.stream.Stream;

/**
 * Stream.ofNullable - делает из элементов поток, если эл равен null, то эл пропускается
 * Этот метод позволяет фильтровать поток с null элементами.
 */

public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(v -> "Result:" + v)
                .forEach(System.out::println);
    }
}
