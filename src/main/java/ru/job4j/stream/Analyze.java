package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс Analyze получает статистику по аттестатам.
 */
public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return
                stream.flatMap(n -> n.getSubjects().stream())
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D);

    }

    /**
     * averageScoreBySubject - метод вернет stream() данных в виде среднего балла по предметам
     *
     * @param stream - принятый поток данных.
     * @return - Возвращает список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(n -> new Tuple(n.getName(),
                        n.getSubjects().stream()
                                .mapToInt(Subject::getScore)
                                .average()
                                .orElse(0D)))
                .collect(Collectors.toList());
    }

    /**
     * Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
     *
     * @param stream
     * @return - Возвращает список из объекта Tuple (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(n -> n.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(n -> new Tuple(n.getKey(), n.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод bestStudent - определит лучшего ученика по getScore, Subject
     *
     * @param stream
     * @return - bestStudent
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(n -> new Tuple(n.getName(), n.getSubjects().stream()
                .mapToInt(Subject::getScore)
                .sum()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(new Tuple("Student", 0));
    }

    /**
     * Метод bestSubject вернет Subject с максимальным баллом
     *
     * @param stream приниме поток
     * @return bestSubject
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(n -> n.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(n -> new Tuple(n.getKey(), n.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }
}
