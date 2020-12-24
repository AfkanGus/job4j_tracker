package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void createItem() {
        String[] answers = {"Create a new Item"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item(0, "Create a new Item");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void replaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(0, "new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }


    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(0, "Delet item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), "Item deleted"
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(tracker.findById(item.getId()));
    }
}