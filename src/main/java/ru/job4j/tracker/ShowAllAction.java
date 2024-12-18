package ru.job4j.tracker;

import java.util.List;
/**
 * Техническое задание - проект Tracker.
 */
public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items:";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println(item.toString());
        }
        return true;
    }
}
