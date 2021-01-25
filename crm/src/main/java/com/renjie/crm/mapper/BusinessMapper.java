package com.renjie.crm.mapper;

import com.renjie.crm.entity.Business;
import com.renjie.crm.entity.query.BusinessQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessMapper {
    Business getWorkByPrimary(String workId);

    List<Business> getListByQuery(BusinessQuery businessQuery);

    int createBusiness(Business business);

    int saveBusiness(Business business);
}
