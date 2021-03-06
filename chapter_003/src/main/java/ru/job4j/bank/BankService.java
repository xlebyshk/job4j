package ru.job4j.bank;


import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User key = findByPassport(passport);
        if (key != null) {
            this.users.get(key).add(account);
        }
    }

    public User findByPassport(String passport) {
        return
                this.users.keySet().stream().filter(
                        user -> user.getPassport().equals(passport)
                ).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = this.users.get(findByPassport(passport));
        return
                accounts.stream().filter(
                        account -> account.getRequisite().equals(requisite)
                ).findFirst().orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
