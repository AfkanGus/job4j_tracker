package ru.job4j.tracker;
/**
 * Техническое задание - проект Tracker.
 */
public class FindIdAction implements UserAction {

    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find an item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item.toString());
        } else {
            out.println("Error, item not find");
        }
        return true;
    }
}
