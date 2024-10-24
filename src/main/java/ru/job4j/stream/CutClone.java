package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Уникальность элементов и сортировка. [#110225]
 */
public class CutClone {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Stepan");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
