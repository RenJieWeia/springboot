package com.renjie.crm.service;

import com.renjie.crm.entity.Business;
import com.renjie.crm.entity.query.BusinessQuery;
import com.renjie.crm.mapper.AccountMapper;
import com.renjie.crm.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BusinessService {
    final
    AccountMapper accountMapper;
    final
    BusinessMapper businessMapper;

    public BusinessService(BusinessMapper businessMapper, AccountService accountService, AccountMapper accountMapper) {
        this.businessMapper = businessMapper;
        this.accountMapper = accountMapper;
    }

    public List<Business> getListByQuery(BusinessQuery query) throws Exception {
        if (Objects.isNull(query.getPartyId()) && Objects.isNull(query.getOriginatorId()))
            throw new Exception("当事人或发起人不能同时为空");
        return businessMapper.getListByQuery(query);
    }

    /**
     * 创建任务 发起人不能有误，必须有执行人
     * @param business
     * @return
     * @throws Exception
     */
    public int saveBusiness(Business business) throws Exception {
        if (Objects.isNull(business.getOriginatorId())||"".equals(business.getOriginatorId().trim())) throw new Exception("发起人为空");

        return 0;
    }


}
