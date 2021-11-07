package ru.job4j.function;

import ru.job4j.lambda.Attachment;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] str = {"12", "0", "6789", "345"};
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + ":" + right.length());
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(str, cmpDescSize);
        for (String string : str) {
            System.out.println(string);
        }

        String[] names = {
                "Ivan"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
        for (String string : names) {
            System.out.println(string);
        }
        String[] namesExecute = {
                "Ivan",
                "Petr"
        };
        Arrays.sort(namesExecute, lengthCmp);
        for (String string : namesExecute) {
            System.out.println(string);
        }
    }
}
