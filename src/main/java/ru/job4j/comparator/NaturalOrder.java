package ru.job4j.comparator;
/**
 * 1.1 Существует поняние naturalOrder(), дословно естесвенный порядок
 * Comparator.naturalOrder() - этот мутод возвращает компаратор, основанный на реализации метода
 * compareTo() у типа,который его вызывает
 * Если вызвать этот метод для числа, например для int, произойдет autoboxing к Integer,
 * и будет использована реализация compareTo в классе Integer.
 * <p>
 * Ваша задача получить компаратор естественного порядка для строки.
 */

import java.util.Comparator;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
