package ru.job4j.map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 6.Анализ лога HTTP  сервера
 * В этом задании нужно реализовать методы для анализа лога от HTTP сервера.
 * <p>
 * Входные данные является список из объектов Line.
 * Объект Line имеет три поля: уровень лога, имя нити и текст
 * сообщения.
 * <p>
 * Необходимо реализовать методы:
 * <p>
 * groupByLevel - метод должен вернуть карту, где ключ - это уровень
 * лога, а значение - количество сообщений.
 * <p>
 * maxByThread - метод должен вернуть имя нити, которая больше всех
 * записала логов.
 * <p>
 * detailByThread - метод должен вернуть карту, где ключ - это уровень
 * лога, а значение - количество сообщений.
 * Этот метод так же принимает имя нити для который нужный логи и список
 * по которому нужно вывести уровени.
 */
public class AnalyzeHttpLog {
    public record Line(String level, String thread, String text) {
    }

    public static Map<String, Long> groupByLevel(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(
                        Line::level,
                        LinkedHashMap::new,
                        Collectors.counting()));
    }

    public static String maxByThread(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(Line::thread, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    public static Map<String, Long> detailByThread(List<Line> logs, String thread,
                                                   List<String> orders) {
        Map<String, Long> result = orders.stream()
                .collect(Collectors.toMap(level -> level, level -> 0L));

        /*Фильтруем логи и добавляем реальные данные*/
        logs.stream()
                .filter(log -> log.thread().equals(thread) && orders.contains(log.level()))
                .collect(Collectors.groupingBy(Line::level, Collectors.counting()))
                .forEach(result::put); // Обновляем результат

        return result;
    }
}
