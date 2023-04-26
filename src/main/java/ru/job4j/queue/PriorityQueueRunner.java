package ru.job4j.queue;

import java.util.PriorityQueue;

public class PriorityQueueRunner {

    private static void printStringElements(PriorityQueue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    private static void printTransactionElements(PriorityQueue<Transaction> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    public static void main(String[] args) {
        /*
        1. Добавление элемента в очередь с приоритетом
        согласно правилам сортировки строк – за это отвечает реализация метода compareTo()
         */
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.offer("b");
        strings.offer("a");
        strings.offer("d");
        strings.offer("c");
        printStringElements(strings);
        System.out.println("--------------------");
        /*
         Добавление элемента в очередь с приоритетом  по убыванию.
         */
        PriorityQueue<Transaction> transactions =
                new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        printTransactionElements(transactions);
        System.out.println("----------------");
        /*
         2. Удаление элементов.
         */
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("b");
        stringQueue.offer("a");
        stringQueue.offer("d");
        stringQueue.offer("c");
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
        System.out.println("-------------");
        /*
        3. Чтение элемента из очереди.
         */
        PriorityQueue<Transaction> transactions1 =
                new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions1.offer(new Transaction(1, "number_1", 100));
        transactions1.offer(new Transaction(2, "number_2", 1000));
        transactions1.offer(new Transaction(3, "number_3", 85));
        transactions1.offer(new Transaction(4, "number_4", 550));
        System.out.println("Current element: " + transactions1.peek());
        System.out.println("Current element: " + transactions1.peek());
        transactions1.poll();
        System.out.println("Current element: " + transactions1.peek());
        transactions1.poll();
        System.out.println("Current element: " + transactions1.peek());
        System.out.println("--------------------------");
        /*
        Распределяться элементы очереди,
        если при сортировке мы сравниваем одинаковые элементы
         */
        PriorityQueue<Transaction> transactions2 =
                new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions2.offer(new Transaction(1, "number_1", 100));
        transactions2.offer(new Transaction(2, "number_2", 1000));
        transactions2.offer(new Transaction(3, "number_3", 85));
        transactions2.offer(new Transaction(3, "number_4", 100));
        transactions2.offer(new Transaction(4, "number_5", 1000));
        transactions2.offer(new Transaction(5, "number_6", 550));
        transactions2.offer(new Transaction(6, "number_7", 100));
        transactions2.offer(new Transaction(8, "number_8", 1000));
        printTransactionElements(transactions2);
    }
}
