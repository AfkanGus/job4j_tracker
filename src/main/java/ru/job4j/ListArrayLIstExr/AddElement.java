package ru.job4j.ListArrayLIstExr;

import java.util.List;
import java.util.ArrayList;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);

        list.add(str);
        return check.size() != list.size();
    }
}

/*2. Размер списка и добавление элементов.
Продолжим знакомство с методами, которые можно использовать со списками.
Чтобы определить размер списка используется метод size() (он определен в интерфейсе Collection<E>,
наследником которого является интерфейс List<E>).

int size() - метод возвращает целочисленное значение, и говорит нам о том, сколько элементов
 находится в списке.

Чтобы добавить элемент в список - используется метод add (который также определен в интерфейсе
 Collection<E>):

boolean add(E e) - метод возвращает булево значение, true - если добавление произошло успешно,
 false - добавление не удалось.

Задание: необходимо реализовать метод, который добавляет элемент в список и сообщает нам
 удалось это или нет, т.е. метод должен вернуть булево значение. Не используйте в методе то,
  что метод возвращает true или false. Для этого на входе в метод мы копируем список в новый список,
   добавляем в тот список, который пришел в методе и в конце сравниваем их размеры - если изменился, значит элемент добавился.*/