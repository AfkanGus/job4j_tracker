package ru.job4j.listarrayexr;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

class AddElementTest {
    @org.junit.jupiter.api.Test
    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add(0, "first");
        list.add(0, "second");
        list.add(0, "third");
        boolean result = AddElement.addNewElement(list, "fourth");
        MatcherAssert.assertThat(result, is(true));
    }
}