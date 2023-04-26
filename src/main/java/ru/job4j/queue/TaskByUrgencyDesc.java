package ru.job4j.queue;

import java.util.Comparator;

/**
 * Сравнивать задачи по убыванию срочности.
 */
public class TaskByUrgencyDesc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.urgency(), o1.urgency());
    }
}
