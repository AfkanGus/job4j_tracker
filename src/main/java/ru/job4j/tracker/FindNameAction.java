package ru.job4j.tracker;

import java.util.List;
/**
 * Техническое задание - проект Tracker.
 */
public class FindNameAction implements UserAction {

    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        if (items != null) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Error, item not find");
        }
        return true;
    }
}
