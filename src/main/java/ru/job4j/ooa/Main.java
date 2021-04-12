package ru.job4j.ooa;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Stas", 31);
        System.out.println("Вывод в консоль до изменения");
        System.out.println(FIRST_USER);

        FIRST_USER.setAge(33);
        FIRST_USER.setName("Petr Arsentev");
        System.out.println("Вывод в консоль после изменения");
        System.out.println(FIRST_USER);
    }
}
