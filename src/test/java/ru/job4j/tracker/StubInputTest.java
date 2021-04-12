
package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StubInputTest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0.Exit" + System.lineSeparator()
        ));

    }

 /*   @Test
    public void whenFindByName() {
        Tracker tracker = Tracker.getInstance();
        //Item item = tracker.add(new Item("Bug"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindNameAction(out), new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. === Find an Item by name ===" + ln
                        + "1. Exit" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. === Find an Item by name ===" + ln
                        + "1. Exit" + ln + ""));
    }*/
}

