package ru.job4j.listarrayexr;

import java.util.List;

public class UniqueElement {

    public static boolean checkList(List<String> list, String str) {
        if (list.indexOf(str) == list.lastIndexOf(str) && list.indexOf(str) != -1) {
            return true;
        }
        return false;
    }
}

