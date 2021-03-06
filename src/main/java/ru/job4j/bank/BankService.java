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

    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принмает пользователя и список счетов
     * Через putIfAbsent проверяется наличие пользователя и счетов,
     * если они есть, то нового добавлять не надо.
     *
     * @param user - объект,в качестве пользователя добовляется в систему.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList());
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
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту, и возвращает найденного пользователя
     *
     * @param passport - паспорт
     * @return - пользователь
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
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
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
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
     * @return - перевод выполнен удачно - true, false - перевод невозможен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                return true;
            }
        }
        return false;
    }
}
