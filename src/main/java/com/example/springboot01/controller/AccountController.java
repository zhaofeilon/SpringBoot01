package com.example.springboot01.controller;

import com.example.springboot01.Service.Impl.AccountServiceImpl;
import com.example.springboot01.entity.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AccountController {

    @Resource
    private AccountServiceImpl accountService;

    @GetMapping("/getAll")
    public List<Account> getAccount(){
        return accountService.getAccount();
    }
}
