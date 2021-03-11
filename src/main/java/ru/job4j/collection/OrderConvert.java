package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            /*Первый параметр - номер, а второй заявка.*/
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
