package ru.job4j.oop;

/**
 * 6.3. Статические вложенные классы [#504951]
 */
public class StNested {
    /**
     * ниже объявлены статическая переменная num1 и нестатическая num2:
     */
    private static int num1;

    /**
     * public int num2;
     */

    public StNested() {
    }

    static class StaticNested {
        /**
         * num1 будет видна из вложенного статического класса,
         * и мы можем изменить её значение. Значение переменной
         * num2 мы изменить из вложенного статического класса
         * StaticNested не сможем, так как статические вложенные
         * классы не имеют доступа к нестатическим полям и методам внешнего класса.
         *
         * @param value
         */
        void setStaticOuterVariable(int value) {
            num1 = value;
        }

    }

    public static void main(String[] args) {
        num1 = 1;
        /**
         * Обратите внимание, что объект статического
         * внутреннего класса можно создать без ссылки на внешний класс.
         */
        StaticNested nested = new StaticNested();
        /**
         *  создаём объект вложенного статического класса StaticNested,
         *  и через его метод setStaticOuterVariable() меняем значение
         *  переменной num1 на 2, то есть это значение меняется через
         *  экземпляр вложенного статического класса StaticNested:
         */
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + num1);
    }
}
