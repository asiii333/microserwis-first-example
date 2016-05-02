package com.micro.application.account;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asia on 2016-05-02.
 */
@Component
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public List<Account> allAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Ada","Korecka",23,"Mango"));
        accounts.add(new Account("Ewa","Korecka",24,"Pomarancza"));
        accounts.add(new Account("Ela","Korecka",25,"Kiwi"));
        return accounts;
    }

    @Override
    public Account getAccount(int id) {
        return new Account("Ada","Korecka",23,"Mango");
    }

    @Override
    public List<Account> getAccountByName(String Name) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Ada","Korecka",23,"Mango"));
        return accounts;
    }
}
