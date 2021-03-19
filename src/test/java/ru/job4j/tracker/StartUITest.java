
package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Exit" + System.lineSeparator()
        ));
    }

    /*FindByNameAction*/
    @Test
    public void whenFindByNameAction() {
        Tracker tracker =  Tracker.getInstance();
        Item item = tracker.add(new Item(0, "TestFirst"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindNameAction(out));
        actions.add(new ExitAction(out));
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
        Tracker tracker =  Tracker.getInstance();
        Item itemOne = tracker.add(new Item(0, "TestFindAll"));
        Item itemTwo = tracker.add(new Item(0, "Error of FindAll"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAllAction(out));
        actions.add(new ExitAction(out));
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
        Tracker tracker =  Tracker.getInstance();
        Item item = tracker.add(new Item(0, "TestFindById"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindIdAction(out));
        actions.add(new ExitAction(out));
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

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "0"}
        );
        Tracker tracker =  Tracker
                .getInstance();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0.Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0.Exit%n"
                )
        ));
    }
}



