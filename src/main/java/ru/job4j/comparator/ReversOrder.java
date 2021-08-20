package ru.job4j.comparator;

import java.util.Comparator;

/**
 * 1.2 Получение компаратора. Метод reverseOrder();
 * Comparator.reverseOrder() - получить обратный порядок элементов
 * Этот метод также использует реализацию метода compareTo().
 * Например, если реализация такая o1.compareTo(o2),
 * то метод reverseOrder() вернет компаратор, основанный на сравнении o2.compareTo(o1).
 * Ваша задача получить обратный компаратор для строки
 */
public class ReversOrder {
    public static Comparator<String> reversOrder() {
        return Comparator.reverseOrder();
    }
}
