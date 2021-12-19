package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу сервиса по управлению пользователей и счетов пользователей
 *
 * @author Guseynov Afkan
 * @version 1.0
 */

public class BankService {
    /**
     * HasMap<>() класс, ислользуемый для хранения взаимодействия пользователей
     * и их счетов.
     */

    private final Map<User, List<Account>> us = new HashMap<>();

    /**
     * Метод принмает пользователя и список счетов
     * Через putIfAbsent проверяется наличие пользователя и счетов,
     * если они есть, то нового добавлять не надо.
     *
     * @param user - объект,в качестве пользователя добовляется в систему.
     */

    public void addUser(User user) {
        us.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает пользователя по паспорту и его счету,
     * Если такого счета у пользователя нет,  метод добовляем новый счет
     * к списку счетов пользователя
     *
     * @param passport - объект в качестве паспорта
     * @param account  - объект в качестве счета пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = us.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту, и возвращает найденного пользователя
     *
     * @param passport - паспорт клиента
     * @return -  найденного пользователя
     */
    public User findByPassport(String passport) {
        return us.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по паспорту и реквизитам пользователя
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - вернуть найденный счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return us.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счета на другой счет
     *
     * @param srcPassport   - поспорт пользовател отправителя
     * @param srcRequisite  -  реквизиты счета пользователя отправителя
     * @param destPassport  - паспорт получателя
     * @param destRequisite - реквизиты счеьа получателя
     * @param amount        - сумма перевода
     */
    public void tMoney(String srcPassport, String srcRequisite,
                       String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
            }
        }
    }
}
