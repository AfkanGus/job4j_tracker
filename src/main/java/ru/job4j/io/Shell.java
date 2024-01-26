package ru.job4j.io;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Shell {
    private static final String PATH_SEPARATOR = "/";
    private final LinkedList<String> stack = new LinkedList<>();

    private void handleAbsolutePath(String path) {
        String[] elements = path.split(PATH_SEPARATOR);
        if (!stack.isEmpty()) {
            stack.clear();
        }
        for (String el : elements) {
            stack.add(el);
        }
    }

    private void handleRelativePath(String path) {
        String[] elements = path.split(PATH_SEPARATOR);
        for (String el : elements) {
            if (el.equals("..") && (!stack.isEmpty())) {
                stack.removeLast();
            } else if (!el.equals("..")) {
                stack.add(el);
            }
        }
    }

    public void cd(String path) {
        if (path.startsWith(PATH_SEPARATOR)) {
            handleAbsolutePath(path);
        } else {
            handleRelativePath(path);
        }
    }

    public String pwd() {
        if (stack.isEmpty()) {
            return PATH_SEPARATOR;
        }
        StringJoiner pathJoiner = new StringJoiner(PATH_SEPARATOR, PATH_SEPARATOR, "");
        for (String part : stack) {
            if (!part.isEmpty()) {
                pathJoiner.add(part);
            }
        }
        return pathJoiner.toString();
    }
}
