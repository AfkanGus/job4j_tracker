package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 1. Фильтрация учеников [#110058]
 * Класс реализует разпределение учеников по группам, согласно набранным баллам.
 *
 * @param - collect - метод вернет отфильтрованные данные в виде списка.
 * @param - students.stream() - получили поток, в виде виде списка учеников.
 * @param - filter(predict) - метод примет лямбда - вырожение, и если оно true
 *          то эл. передаются дальше в список.
 * @param - collect(Collectors.toList()) - метод преобразует данные в список
 * @param - Collectors.toMap - метод преобразует список студентов в Map<K,V>K-
 *          ключ карты - фамилия, V- значение- ученик.
 */
public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> collInMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        e -> e,
                        (a, s) -> s
                ));
    }
}
