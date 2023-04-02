package ru.job4j.varargs;

public class VarNeo {
    /*
    Далее рассмотрим неоднозначность, которая может возникать при работе с varargs.
     Неоднозначность - это двусмысленность кода, когда компилятор не может понять,
      какой из существующих вариантов ему нужно выбрать. Неоднозначность возникает
       при перегрузке методов и приводит к ошибке компиляции.
     */
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

 /*   public static String text(String name, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }*/

    public static void main(String[] args) {
        System.out.println(text());
        /*
        Здесь в случае передачи в метод только одного аргумента типа String
         компилятор не поймёт какой из этих перегруженных методов ему использовать,
          так как оба варианта будут подходящими:
          Неоднозначность можно разрешить путём отказа от перегрузки и объявления
           такого же метода, но с другим именем.
         */
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text("aaa", "bbb", "ccc", "ddd", "eee"));
    }
}
