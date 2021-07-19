package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image", 100),
                new Attachment("image", 34),
                new Attachment("image", 13)
        );
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment rigth) {
                return left.getSize() - rigth.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator comparator1 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comparator1);
        System.out.println(attachments);
    }
}