package ru.job4j.oop;

/**
 * 6.2. Локальные и анонимные внутренние классы [#504952]
 * Локальный класс - это разновидность внутреннего класса,
 * в которой класс объявляется в другом классе внутри какого-либо
 * блока кода (между фигурными скобками { }).
 * Локальный класс применяется, когда нужно написать класс,
 * который планируется использовать в пределах одного метода или другого блока кода
 */
public class Local {
    private String name = "Petr";

    public void getFullName() {
        /**
         Локальные классы работают только с final
         effective final переменными.
         Effective final переменная - это переменная,
         которая никогда не меняется после её инициализации.
         */
        final String surname = "Arsentev";
/**
 *  локальный класс FullName вложен в метод getFullName() класса Local.
 */
        class FullName {

            public void printFullName() {
                System.out.println(name + " " + surname);
            }

        }
/**
 * Далее создается экземпляр локального класса FullName:
 */

        FullName fullName = new FullName();
        fullName.printFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
