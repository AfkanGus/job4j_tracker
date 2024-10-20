package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 12. Выборка элементов из потока [#504925].
 * - skip(n) - промежуточная операция, пропускает первые n элементов с начала потока. То есть задает начальную
 * границу диапазона перебираемых элементов.
 * - limit(n) - промежуточная операция, возвращает новый поток, содержащий только первые n элементов из исходного
 * потока, то есть задает конечную границу диапазона перебираемых элементов.
 * Метод skip(2) пропускает первые 2 элемента и возвращает новый поток, содержащий элементы "Три", "Четыре", "Пять".
 * Далее уже из этого потока метод limit(2) отбирает только первые 2 элемента. В результате имеем вывод.
 * - findFirst() - терминальная операция, получает первый элемент из потока.
 */
public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("odin", "dva", "Tri", "Cetire", "Pyat");
        String result = strings
                .stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("Defolt");
        System.out.println(result);
    }
}
