package ru.job4j.tracker;

import java.util.Scanner;

public final class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());

            if (select == 0) {
                System.out.println("Добавить  новый Item/Add new Item");
                System.out.print("Введите имя/Enter name: ");
                //Запрос имени заявки
                String name = scanner.nextLine();
                Item item = new Item(0, name);
                //Добавить эту заявку в хранилище item
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("Show all items:");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println("Name - " + items[i].getName() + ", Id - " + items[i].getId());
                }

            } else if (select == 2) {
                System.out.println("Edit item");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(id, name);
                if (tracker.replace(id, item)) {
                    //вывод успешности операции
                    System.out.println("item replaced/заменить item");
                } else {
                    // вывод об ошибке
                    System.out.println("Error, item not replaced/item не заменен");
                }

            } else if (select == 3) {
                System.out.println("Delete item");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");// вывод об успешности операции
                } else {
                    System.out.println("Error, item not deleted");// вывод об ошибк
                }

            } else if (select == 4) {
                System.out.println("Find an item by id ");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("Error, item not find");
                }

            } else if (select == 5) {
                System.out.println("Find item by name");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Error, item not find");
                }

            } else if (select == 6) {
                //Закрываем программу
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.printf(" %n Menu. %n"
                + " 0. Add new Item %n"
                + " 1. Show all items %n"
                + " 2. Edit item %n"
                + " 3. Delete item %n"
                + " 4. Find item by Id %n"
                + " 5. Find items by name %n"
                + " 6. Exit Program %n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}


/*Один объект класса item
        Item item = new Item(1, "Java");
        /*Вывод на консоль*
        System.out.println(item.toString());

       /* LocalDateTime created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formatterCreateDate = created.format(formatter);
        System.out.println(formatter.format(item.getCreated()));
        System.out.println(item.toString());
        Tracker tracker = new Tracker();
        tracker.add(item);
        Item result = tracker.findById(1);
        System.out.println(result.toString());*/