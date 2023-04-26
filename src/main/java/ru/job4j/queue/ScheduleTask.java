package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Сортировки задач в очереди.
 */
public class ScheduleTask {
    private PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    /**
     * Добавляет переданную задачу в очередь.
     *
     * @param task
     */
    public void addTask(Task task) {
        queue.offer(task);
    }

    /**
     * просто читает элемент из головы очереди без удаления;
     *
     * @return head task.
     */
    public Task readTask() {
        return queue.peek();
    }

    /**
     * просто возвращает задачу из головы очереди с удалением.
     *
     * @return head task whit remove.
     */
    public Task getTask() {
        return queue.poll();
    }
}
