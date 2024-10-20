package ru.job4j.tracker;
/**
 * Техническое задание - проект Tracker.
 */
public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            out.println("Item deleted");
        } else {
            out.println("Error, item not deleted");
        }
        return true;
    }
}
