package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParenthesesTest {
    @Test
    public void whenValidInner() {
        assertThat(
                Parentheses.valid(new char[] {'(', '(', ')', ')'}),
                is(true)
        );
    }

    @Test
    public void whenValidSeq() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '(', ')'}),
                is(true)
        );
    }

    @Test
    public void whenInvalidInner() {
        assertThat(
                Parentheses.valid(new char[] {')', ')', '(', '('}),
                is(false)
        );
    }

    @Test
    public void whenInvalidSeq1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '(', '('}),
                is(false)
        );
    }

    @Test
    public void whenInvalidSeq2() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', ')', '('}),
                is(false)
        );
    }

    @Test
    public void whenOnlyInner() {
        assertThat(
                Parentheses.valid(new char[] {'('}),
                is(false)
        );
    }

    @Test
    public void whenOnlySeq() {
        assertThat(
                Parentheses.valid(new char[] {')'}),
                is(false)
        );
    }

    @Test
    public void whenSeqLack1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '('}),
                is(false)
        );
    }

    @Test
    public void whenInnerLack1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', ')'}),
                is(false)
        );
    }

    @Test
    public void whenSeqLack2() {
        assertThat(
                Parentheses.valid(new char[] {'(', '(', ')'}),
                is(false)
        );
    }
}