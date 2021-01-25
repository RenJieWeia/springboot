package com.renjie.crm.mapper;

import com.renjie.crm.entity.Account;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AccountMapper {
    Account getAccountByPrimary(String accountId);
}
