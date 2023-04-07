package ru.job4j.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Queue -  хранилище однотипных элементов, в котором первым будет
 * извлекаться тот элемент, который был туда и вставлен первым -  FIFO.
 */
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        System.out.println(queue.peek());
    }
}
