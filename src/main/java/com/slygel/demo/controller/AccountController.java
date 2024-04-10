package com.slygel.demo.controller;

import com.slygel.demo.model.AccountModel;
import com.slygel.demo.responseUtil.base.VsResponseUtil;
import com.slygel.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/getAccounts")
    public ResponseEntity<?> getAllAccount(){
        List<AccountModel> accountModels = new ArrayList<>(accountService.getAllAccount());
        return VsResponseUtil.success(HttpStatus.OK,accountModels);
    }
}
