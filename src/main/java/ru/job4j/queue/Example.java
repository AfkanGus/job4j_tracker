package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);
        /*
        pop()позволяет удалить головной элемент из очереди и вернуть его.
         */
        System.out.println(deque);
        /* pop() – позволяет удалить головной элемент из очереди и вернуть его.
         */
        System.out.println(deque.pop() + " Удалил первый");
        System.out.println(deque);
        /*
        poll() –методы позволяют удалить верхний (первый) элемент из очереди.
        */
        System.out.println(deque.poll() + " удалил верxний");
        System.out.println(deque);
        System.out.println(deque.pollFirst() + " remove first");
        System.out.println(deque);
        System.out.println(deque.pollLast() + " remove last");
        System.out.println(deque);
        Iterator<Integer> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " перебирать нашу очередь в обратном порядке"
                    + ". Для этого определен метод descendingIterator():");
        }
    }
}
