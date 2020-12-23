package ru.job4j.Job4.execises.Loop;

public class Symmetry {
    public static boolean check(int i) {
     /*   if (i == 0) return true;
        else if (i < 0) return false;
        int DEG_10 = (int)(Math.pow(10, (int)Math.log10(i)));
        while (i > 0){
            long dStart = i / DEG_10;
            long dEnd = i % 10;
            if (dStart != dEnd) return false;
            i = (int) ((i - dStart * DEG_10 - dEnd) / 10);
            DEG_10 /= 100;
        }*/
     /*   String val = String.valueOf(i); // Get the string.
        StringBuilder sb = new StringBuilder(val);
        return (val.equals(sb.reverse().toString()));*/
        boolean rsl = true;
        String string = Integer.toString(i);
        for (int j = 0, k = string.length() - 1; j < string.length() / 2; j++, k--) {
            if (string.charAt(j) != string.charAt(k)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
/*
* 12. Симметричное число
Метод принимает целочисленное значение. Необходимо проверить
*  является ли оно симметричным или нет. Симметричным
* считается число в котором числа идущие по порядку
* в прямом и обратном порядке равны друг другу.
Для решения можете преобразовать число в строку. Проходите
*  по полученной строке в цикле, до середины и сравниваете
* символ который стоит на первой позиции  с символом на
*  последней, второй позиции с символом на предпоследней и
* т.д. Для извлечения символов используйте метод charAt().
*
Метод должен вернуть true, если число симметричное.*/