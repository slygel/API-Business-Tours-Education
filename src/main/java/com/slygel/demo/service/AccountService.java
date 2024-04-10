package com.slygel.demo.service;

import com.slygel.demo.entity.Account;
import com.slygel.demo.model.AccountModel;
import com.slygel.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService  {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountModel> getAllAccount(){
        List<Account> accounts = accountRepository.getAllAccount();
        List<AccountModel>accountModels = new ArrayList<>();
        for(Account account : accounts){
            accountModels.add(new AccountModel(account));
        }
        return accountModels;
    }
}
