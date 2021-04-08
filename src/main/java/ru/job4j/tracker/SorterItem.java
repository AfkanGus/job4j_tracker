
package ru.job4j.tracker;

import java.util.Comparator;

public class SorterItem implements Comparator<Item> {
    @Override
    public int compare(Item one, Item two) {

        return two.getName().compareTo(one.getName());
    }
}

