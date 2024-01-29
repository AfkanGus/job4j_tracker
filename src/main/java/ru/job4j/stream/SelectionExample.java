package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 12. Выборка элементов из потока [#504925].
 * - skip(n) - промежуточная операция, пропускает первые n элементов с начала потока. То есть задает начальную
 * границу диапазона перебираемых элементов.
 * - limit(n) - промежуточная операция, возвращает новый поток, содержащий только первые n элементов из исходного
 * потока, то есть задает конечную границу диапазона перебираемых элементов.
 */
public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("odin", "dva", "Tri", "Cetire", "Pyat");
        List<String> result = strings
                .stream()
                /*.skip(2)*/
                .limit(3)
                .toList();
        System.out.println(result);
    }

}
