package ru.job4j.listarrayexr.phonedis;

public class Task {
    /*java.util.ArrayList;
     * inteface - java.util.List;
     *  other implementation java.util.LindedList-
     *  связанные списки - организуют вставки и удаления элементов
     * */

    /*Очередь с приоритетами*/
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
