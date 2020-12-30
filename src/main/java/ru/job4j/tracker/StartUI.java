package ru.job4j.tracker;

public final class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr("Select: "));
            UserAction action = actions[select];
            run = action.execute(input, tracker);


        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new ShowAllAction(),
                new ReplaceAction(), new FindNameAction(),
                new FindIdAction(), new DeleteAction(),
                new ExitAction()

        };
        new StartUI().init(input, tracker, actions);
    }
}

