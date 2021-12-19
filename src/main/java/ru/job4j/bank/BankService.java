package ru.job4j.bank;

import java.util.*;

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

    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принмает пользователя и список счетов
     * Через putIfAbsent проверяется наличие пользователя и счетов,
     * если они есть, то нового добавлять не надо.
     *
     * @param user - объект,в качестве пользователя добовляется в систему.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccount = users.get(user.get());
            if (userAccount != null) {
                if (!userAccount.contains(account)) {
                    userAccount.add(account);
                }
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту, и возвращает найденного пользователя
     *
     * @param passport - паспорт клиента
     * @return -  найденного пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(key -> key.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по паспорту и реквизитам пользователя
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - вернуть найденный счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        return user.map(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()).orElse(rsl);
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
    public boolean transferMoney(String srcPassword, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassword, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
