package ru.job4j.queue;

import java.util.Deque;

/**
 * 2. Интерфейс Deque [#504943].
 *
 * @author afkan
 * @version 1.0
 */
public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int sizeString = evenElements.size() / 2;
        for (int i = 0; i < sizeString; i++) {
            stringBuilder.append(evenElements.poll());
            evenElements.poll();
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder tmp = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            tmp.append(descendingElements.pollLast());
        }
        return tmp.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
