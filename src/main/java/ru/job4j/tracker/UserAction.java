package ru.job4j.tracker;
/**
 * Техническое задание - проект Tracker.
 */
public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
