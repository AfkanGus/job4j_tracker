package ru.job4j.listarrayexr.phonedis;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task elem : tasks) {
            if (elem.getPriority() > task.getPriority()) {
                break;
            }
            index = tasks.size();
        }

        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
