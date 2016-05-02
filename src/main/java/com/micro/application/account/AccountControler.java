package com.micro.application.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Asia on 2016-05-02.
 */
@RestController
@RequestMapping("/account")
public class AccountControler {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = GET)
    public List<Account> allAccount() {
        return accountRepository.allAccounts();
    }

    @RequestMapping(method = GET, value="/{id}")
    public Account accountById(@PathVariable(value = "id") int id) {
        return accountRepository.getAccount(id);
    }
}
