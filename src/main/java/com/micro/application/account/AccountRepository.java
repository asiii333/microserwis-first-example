package com.micro.application.account;

import java.util.List;

/**
 * Created by Asia on 2016-05-02.
 */
public interface AccountRepository {
    List<Account> allAccounts();
    Account getAccount(int id);
    List<Account> getAccountByName(String Name);
}
