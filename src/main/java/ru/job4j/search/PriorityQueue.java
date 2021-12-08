package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /*
     * найти index нужного элемента.
     * */
    public void put(Task task) {
        var index = 0;
        /*
         * пройдемся по всем элементам, а индекс будет равен размеру всей коллекции
         * .*/
        for (Task element : tasks) {
            /*Сравниваем приаритеты важности*/
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /*
     * Метод take возвращает первый элемент из списка и удаляет его.
     * Эти действия мы делаем через метод poll().*/
    public Task take() {
        return tasks.poll();
    }
}
