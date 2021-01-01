package ru.job4j.tracker;

public class ReplaceAction  implements UserAction{
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
            System.out.println("item replaced/заменить item");
        } else {
            // вывод об ошибке
            System.out.println("Error, item not replaced/item не заменен");
        }
        return true;
    }

}
