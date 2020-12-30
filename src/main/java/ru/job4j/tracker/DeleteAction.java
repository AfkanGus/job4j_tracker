package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Item deleted");// вывод об успешности операции
        } else {
            System.out.println("Error, item not deleted");// вывод об ошибк
        }

        return true;
    }
}
