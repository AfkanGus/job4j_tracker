package ru.job4j.set;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/**
 * 0.5. Джекпот в казино
 */
public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> str = new HashSet<>();
        str.addAll(Arrays.asList(combination));
        return str.size() == 1;
    }
}
