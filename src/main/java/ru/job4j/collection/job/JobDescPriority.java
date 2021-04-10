package ru.job4j.collection.job;

import java.util.Comparator;

/*Компаратор по убыванию для полей приоритет*/
public class JobDescPriority implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }

}
