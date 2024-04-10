package com.slygel.demo.model;

import com.slygel.demo.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {

    private long accountId;
    private String username;
    private String password;
    private String role;

    public AccountModel(Account account){
        this.accountId = account.getAccountId();
        this.username = account.getUsername();
        this.password = account.getPassword();
        this.role = account.getRole();
    }
}
