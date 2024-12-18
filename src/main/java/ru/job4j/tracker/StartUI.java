package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Техническое задание - проект Tracker.
 */
public final class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            /*Проверка наличия выбранного пункта меню*/
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + "." + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        /*Объект tracker должен быть один,его получем через метод getInstance()*/
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new ShowAllAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new FindNameAction(output));
        actions.add(new FindIdAction(output));
        actions.add(new DeleteAction(output));
        actions.add(new ExitAction(output));
        actions.add(new CreateManyItems(output));
        actions.add(new DeleteAllItems(output));
        new StartUI(output).init(input, tracker, actions);
    }
}

