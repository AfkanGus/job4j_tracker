package ru.job4j.format;

import java.util.Calendar;

/**
 * 9. Форматирование данных. Методы format() и printf().
 */
public class Format {
    public static void getGreeting(String name, int age) {
        /**
         * первый параметр метода format() передаётся строка
         * с указанным спецификатором %s,
         *  %s здесь означает тип аргумента, который будет передан на форматирование
         * c  помощью спецификатора d% мы передаём на форматирование целое число
         *  %b. Любой переданный аргумент будет превращён в true. Если же передан null, то false:
         *  - %c. Задаёт любой символ из таблицы Юникод.
         *  %n. Задает разделитель строк.
         *  %t. Преобразует дату и время. Применяется только с дополнительными флагами.
         *   %f. Задаёт число с плавающей точкой.
         */
        System.out.println(String.format("Hi, i'm %s, i'm %d", name, age));
        System.out.println(String.format("Аргумент передан? %b", 55));
        System.out.println(String.format("Jo%c4j", 'b'));
        System.out.format("Строка1%nСтрока2");
        System.out.println(String.format("Задаем число 0.99 - %f", 0.99));
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF,"
                + "Текущее время: %tT", name, instance, instance));
    }

    public static void main(String[] args) {
        getGreeting("Helena", 12);
        getGreetingAndTime("Hellen");
    }
}
