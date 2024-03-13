package ru.job4j.search;
/**
 * 5. Очередь с приоритетом на LinkedList [#41670 #58972].
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
