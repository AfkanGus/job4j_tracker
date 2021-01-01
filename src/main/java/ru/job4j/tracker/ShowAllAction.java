package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
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
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            out.println("Name - " + items[i].getName() + ", Id - " + items[i].getId());
        }
        return true;
    }
}
