package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(formatter.format(item.getCreated()));

        Tracker tracker = new Tracker();
        tracker.add(item);
        Item result = tracker.findById();
        System.out.println(result.toString());
    }
}
