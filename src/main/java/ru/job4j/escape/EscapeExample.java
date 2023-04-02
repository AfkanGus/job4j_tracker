package ru.job4j.escape;

/**
 * 14. Экранирование символов. Управляющие последовательности. [#504916]
 */
public class EscapeExample {
    public static void main(String[] args) {
        /*
        если нам нужно передать текст, в котором присутствуют двойные кавычки,
         то при попытке передать такой текст в чистом виде, компилятор не поймет
         */
        String str = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(str);
        char escape = '\"';
        System.out.println(escape);
        /* \' - Добавляет одинарную кавычку
         */
        System.out.println('\'');
        String str1 = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(str1);
        /*
         \\ - Добавляет обратный слэш
         */
        String str2 = "C:\\projects\\job4j\\File.java";
        System.out.println(str2);
        /*
         \r - Возврат курсора в начало строки
         */
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        /*
         \n - Перевод курсора на новую строку
         */
        System.out.print("Первая строка\nВторая строка");
        /*
        \t - Табуляция
         */
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        /*
        \b - Возврат курсора на одну позицию назад
         */
        System.out.println("Job4jjj\b\b");
    }
}
