package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 3. Ссылки на методы [#70608]
 * Класс вывода на консоль списка имен
 *
 * @param - Метод forEach() -  принимает объект Consumer,через лямбда
 * @param - cutOut - вернет значение строки, если имя больше 10 символов
 * @author Af
 * @version 1
 */
public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        /*
        RefMethod::cutOut - вызов cutOut через оператор ::
         */
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
