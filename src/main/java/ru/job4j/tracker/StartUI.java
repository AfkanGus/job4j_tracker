
package ru.job4j.tracker;

public final class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("Create a new Item");
        String name = input.askStr("Enter name: ");
        Item item = new Item(0, name);
        tracker.add(item);
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("Show all items:");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println("Name - " + items[i].getName() + ", Id - " + items[i].getId());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("Edit item");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            //вывод успешности операции
            System.out.println("item replaced/заменить item");
        } else {
            // вывод об ошибке
            System.out.println("Error, item not replaced/item не заменен");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("Delete item");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Item deleted");// вывод об успешности операции
        } else {
            System.out.println("Error, item not deleted");// вывод об ошибк
        }
    }

    public static void findItemByID(Input input, Tracker tracker) {
        System.out.println("Find an item by id ");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Error, item not find");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("Find item by name");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Error, item not find");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemByID(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }

    }

    private void showMenu() {
        System.out.printf(" %n Menu. %n" +
                " 0. Add new Item %n " +
                "1. Show all items %n " +
                "2. Edit item %n " +
                "3. Delete item %n " +
                "4. Find item by Id %n " +
                "5. Find items by name %n " +
                "6. Exit Program %n");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}


