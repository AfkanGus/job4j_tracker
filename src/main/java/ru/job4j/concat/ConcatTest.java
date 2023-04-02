package ru.job4j.concat;

/**
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer.
 */
public class ConcatTest {
    public static void main(String[] args) {
        /*
          Сложение строк с помощью оператора "+".
          Скорость работы программы замеряется  следующим образом.
           Сначала фиксируем время старта программы в миллисекундах в строке
         */
        long startTime = System.currentTimeMillis();
        String str = "Job4j";
        for (int index = 0; index < 9999; index++) {
            str = str + index;
        }
        /*
        далее время работы программы рассчитываем в виде вычитания времени старта
         программы из времени её фактического окончания в строке
         */
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
