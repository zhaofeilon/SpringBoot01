package com.example.springboot01.Service.Impl;

import com.example.springboot01.Service.AccountService;
import com.example.springboot01.entity.Account;
import com.example.springboot01.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAccount() {
        return accountMapper.selectList(null);
    }
}
