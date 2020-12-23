package ru.job4j.Job4.execises.Loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        if (stringBuilder.length() > 4) {
            for (int i = stringBuilder.length() - 5; i >= 0; i--) {
                stringBuilder.setCharAt(i, '#');
            }
        }
        if (s.length() == 0) {
            return "empty";
        }
        return stringBuilder.toString();
    }
}
/*
* 11. Шифр строки
Необходимо реализовать метод, который принимает строку, которую необходимо
*  зашифровать таким образом, чтобы на выходе отражались только 4 последних
*  элемента, все остальные были заменены на #. При этом соблюсти условия:
1. Если входная строка пустая - необходимо вернуть строку "empty"
2. Если входная строка содержит больше 0 и не более 4 символов - метод должен
* вернуть исходную строку.
Для решения используйте StringBuilder и его метод setCharAt().*/
