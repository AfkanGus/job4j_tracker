package ru.job4j.varargs;

/**
 * 15. Аргументы переменной длины (varargs) [#504977]
 * Varargs упрощает создание методов, принимающих произвольное
 * количество аргументов, облегчая написание кода и его читабельность.
 * Метод, принимающий произвольное количество аргументов называется методом
 * с аргументами произвольной длины.
 * <p>
 * Методы с аргументами произвольной длины можно использовать, когда в метод могут
 * передаваться, например, не все запланированные параметры или если в метод
 * планируется передавать не только разное количество аргументов
 * , но и аргументы разного типа.
 */
public class VarArgs {
    /*
    Varargs появился в Java 5. До Java 5 обработка аргументов
     переменной длины осуществлялась следующими способами:
     Нужно перегружать много различных вариантов
     */
    public String text(String a) {
        return "";
    }

    public String text(String a, String b) {
        return "";
    }

    public String text(String a, String b, String c) {
        return "";
    }

    /*
    В случаях, когда аргументов много или их количество неизвестно.
    В Java 5 появился удобный механизм varargs, позволяющий быстро
     и просто обрабатывать аргументы произвольной длины.
      Аргументы переменной длины объявляются в коде в виде
       троеточия "..." между типом данных и именем.
     */
    public static String textVarargs(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder + " Количество соединенных элементов: " + strings.length;
    }

    /*
    Методы с аргументами произвольной длины можно перегружать. Например,
     в следующем примере метод text() перегружен еще одним его вариантом:
     В методе с аргументами произвольной длины можно задавать
     и обычные параметры помимо произвольных.
     */
    public static String text(int x, int y, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(textVarargs());
        System.out.println(textVarargs("aaa"));
        System.out.println(textVarargs("aaa", "bbb", "ccc"));
        System.out.println(textVarargs("aaa", "bbb", "ccc", "ddd", "eee"));
    }
}
