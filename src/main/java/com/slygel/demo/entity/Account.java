package com.slygel.demo.entity;

import com.slygel.demo.model.AccountModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
public class Account {

    @Id
    private long accountId;

    private String username;
    private String password;
    private String role;

    public Account() {
    }

    public Account(AccountModel accountModel){
        this.accountId = accountModel.getAccountId();
        this.username = accountModel.getUsername();
        this.password = accountModel.getPassword();
        this.role = accountModel.getRole();
    }
}
