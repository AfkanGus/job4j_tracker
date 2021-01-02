
package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
/*   @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        *//* Добавим в tracker новую заявку *//*
        Item item = tracker.add(new Item(0,"Replaced item"));
        *//* Входные данные должны содержать ID добавленной заявки item.getId() *//*
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0","1",replacedName,"1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        *//* Добавим в tracker новую заявку *//*
        Item item = tracker.add(new Item(0,"Deleted item"));
        *//* Входные данные должны содержать ID добавленной заявки item.getId() *//*
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }*/

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Exit" + System.lineSeparator()
        ));
    }

    /*FindByNameAction*/
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(0, "TestFirst"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Find item by name" + System.lineSeparator() +
                        "1.Exit" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0.Find item by name" + System.lineSeparator()
                        + "1.Exit" + System.lineSeparator() + ""));
    }

    /*ShowAllAction*/
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item itemOne = tracker.add(new Item(0, "TestFindAll"));
        Item itemTwo = tracker.add(new Item(0, "Error of FindAll"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0.Show all items:" + System.lineSeparator()
                        + "1.Exit" + System.lineSeparator()
                        + itemOne + System.lineSeparator()
                        + itemTwo + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0.Show all items:" + System.lineSeparator()
                        + "1.Exit" + System.lineSeparator() + ""));
    }

    /*FindByIdAction*/
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(0, "TestFindById"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Find an item by id" + ln
                        + "1.Exit" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0.Find an item by id" + ln
                        + "1.Exit" + ln + ""));
    }
}



