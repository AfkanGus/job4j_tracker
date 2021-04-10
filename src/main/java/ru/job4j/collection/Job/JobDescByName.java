package ru.job4j.collection.Job;

import java.util.Comparator;

/*Компаратор по убыванию для полей имени*/
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
