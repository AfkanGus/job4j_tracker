package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class StartUI {
    public static void main(String[] args) {
        /*Один объект класса item*/
        Item item = new Item(1, "Java");
        /*Вывод на консоль*/
        System.out.println(item.toString());

       /* LocalDateTime created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formatterCreateDate = created.format(formatter);
        System.out.println(formatter.format(item.getCreated()));
        System.out.println(item.toString());
        Tracker tracker = new Tracker();
        tracker.add(item);
        Item result = tracker.findById(1);
        System.out.println(result.toString());*/
    }
}
