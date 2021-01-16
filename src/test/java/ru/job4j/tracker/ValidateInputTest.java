package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ValidateInputTest {
    @Test/*Тест-проверка введеных неверных данных,потом верных*/
    public void whenInvalidTest() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test/*Тест-проверка правильного ввода*/
    public void whenValidTest() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test/*Тест- проверка ввода отрицательного числа*/
    public void whenZeroInputTest() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }

    @Test
    public void whenMultipleInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "Java", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        String name = input.askStr("Enter name:");
        int id = input.askInt("Enter name:");
        assertTrue(selected == 1 && id == 2 && name == "Java");
    }
}