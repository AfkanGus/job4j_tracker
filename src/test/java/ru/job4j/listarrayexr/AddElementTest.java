package ru.job4j.listarrayexr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddElementTest {
    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add(0, "first");
        list.add(0, "second");
        list.add(0, "third");
        boolean result = AddElement.addNewElement(list, "fourth");
        assertThat(result, is(true));
    }
}