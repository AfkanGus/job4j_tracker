package ru.job4j.oop;

/**
 * 6.3. Статические вложенные классы [#504951]
 */
public class Calc {
    /**
     * в класс Calc вложен статический класс Multiple
     * , с помощью которого можно вычислить квадрат числа.
     */
    public static class Multiple {

        private final int rsl;

        public Multiple(int number) {
            rsl = number;
        }

        public int getResult() {
            return rsl;
        }

    }

    /**
     * В методе getMult() вычисляется результат
     * и возвращается объект вложенного класса Multiple:
     */
    public static Multiple getMult(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    public static void main(String[] args) {
        Calc.Multiple mult = Calc.getMult(3);
        System.out.println("Квадрат числа равен " + mult.getResult());
    }
}
