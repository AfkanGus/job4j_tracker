package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {

        int rsl = -1;
        for (String v : value) {
            if (v.equals(key)) {
                return rsl;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"First", "Second"}, "Digit");

        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
