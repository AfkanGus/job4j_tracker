package ru.job4j.concat;

import java.util.StringJoiner;

/**
 * Вышеприведенный пример можно переписать с помощью StringBuilder.
 */
public class ConcatS {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            /*
            append() здесь присоединяет переданные ему строки к объекту StringBuilder.
             */
            stringBuilder.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
/*
String.concat().. Метод concat() можно объединять в цепочку,
 в результате работы которой будет возвращена новая строка без
  накладных расходов в виде создания промежуточных строк.
 */
        String str = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str);

        /*объединить 2 и более строки с каким-либо разделителем,
         например пробелом, то можно использовать метод join() класса String
         */
        String stringJoin = String.join(" ", "abc", "def", "ghi");
        System.out.println(stringJoin);

        /*В Java есть удобный класс для составления строк - StringJoiner. StringJoiner
         базируется на StringBuilder и имеет удобную возможность соединять
          строки через разделитель, а также добавлять префикс и/или суффикс
           к результирующей строке.
         */
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}

