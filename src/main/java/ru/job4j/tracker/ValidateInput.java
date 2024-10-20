package ru.job4j.tracker;
/**
 * Техническое задание - проект Tracker.
 */
public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override/*Метод для проверки, что ведено строка вместо числа*/
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate date again.");
            }
        }
        while (invalid);
        return value;
    }
}
