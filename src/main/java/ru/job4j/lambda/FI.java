package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 120),
                new Attachment("image 3", 100),
                new Attachment("image 2", 23),
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);
        for (Attachment attachment : atts) {
            System.out.println(attachment);
        }
        System.out.println();

        String[] str = {"12", "0", "6789", "345"};
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Arrays.sort(str, cmpText);
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println();

        Comparator<String> cmpDescSize = (left, right) -> {
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(str, cmpDescSize);
        for (
                String string : str) {
            System.out.println(string);
        }
    }
}
