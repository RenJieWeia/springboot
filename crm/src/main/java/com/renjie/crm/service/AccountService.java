package com.renjie.crm.service;

import com.renjie.crm.entity.Account;
import com.renjie.crm.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class AccountService {
    final
    AccountMapper accountMapper;

    public AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }


    public Account checkAccount(Account account) throws Exception {
        if (Objects.isNull(account.getAccountId())||account.getAccountId().equals("")) throw new Exception("用户名不能为空");
        Account reference = accountMapper.getAccountByPrimary(account.getAccountId());
        if (Objects.isNull(reference)) throw  new Exception("用户不存在");
        if (!Objects.equals(account.getPassword(),reference.getPassword())) throw  new Exception("密码错误");
        return account;
    }
}
