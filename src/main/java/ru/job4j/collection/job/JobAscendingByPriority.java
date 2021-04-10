package ru.job4j.collection.job;

import java.util.Comparator;

/*Компанатор по возрастанию для полей приоритета*/

public class JobAscendingByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());

    }
}
