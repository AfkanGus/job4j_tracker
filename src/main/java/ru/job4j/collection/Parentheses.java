package ru.job4j.collection;

import java.util.Stack;

public class Parentheses {
    public static boolean valid(char[] data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
