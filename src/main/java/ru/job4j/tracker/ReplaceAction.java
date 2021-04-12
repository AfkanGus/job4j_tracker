package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {

        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter name:");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            //вывод успешности операции
            out.println("item replaced/заменить item");
        } else {
            // вывод об ошибке
            out.println("Error, item not replaced/item не заменен");
        }
        return true;
    }

}
