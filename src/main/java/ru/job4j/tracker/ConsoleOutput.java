package ru.job4j.tracker;
/**
 * Техническое задание - проект Tracker.
 */
public class   ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
