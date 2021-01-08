package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    @Override/*Метод для проверки, что ведено строка вместо числа*/
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate date again.");
            }
        }
        while (invalid);
        return value;
    }
}
