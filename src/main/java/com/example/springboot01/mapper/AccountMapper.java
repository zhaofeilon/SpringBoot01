package com.example.springboot01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot01.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  AccountMapper extends BaseMapper<Account> {

}
