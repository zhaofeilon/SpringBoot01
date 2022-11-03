package com.example.springboot01.Service;

import com.example.springboot01.Service.ServiceImpl.AccountServiceImpl;
import com.example.springboot01.entity.Account;
import com.example.springboot01.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService implements AccountServiceImpl {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAccount() {
        return accountMapper.selectList(null);
    }
}
