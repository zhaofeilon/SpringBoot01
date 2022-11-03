package com.example.springboot01;

import com.example.springboot01.entity.Account;
import com.example.springboot01.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBoot01ApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        //参数是一个Wrapper，条件结构器，这里先不用 填null
        //查询所有的用户
        List<Account> accounts = accountMapper.selectList(null);
        accounts.forEach(System.out::println);
        System.out.println("结束");
    }
    @Test
    void insert() {
        accountMapper.insert(new Account(2,"74093740","小花"));
    }
    @Test
    void insert2() {

        Account account = new Account();
        account.setPassword("efwfe");
        account.setUsername("小乐");
        accountMapper.insert(account);
    }
}
