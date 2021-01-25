package com.renjie.crm.controller;

import com.renjie.crm.entity.Business;
import com.renjie.crm.entity.query.BusinessQuery;
import com.renjie.crm.service.BusinessService;
import com.renjie.crm.until.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin
@ResponseBody
public class BusinessController {
    final
    BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("business")
    Result geBusinessList(BusinessQuery query) {
        Result result = new Result();
        try {
            result.setData(businessService.getListByQuery(query));
            result.setStatus(200);
        } catch (Exception e) {
            result.setStatus(1002);
            result.setMsg(e.getMessage());
        }
        return result;
    }
    @PostMapping("business")
    Result createBusiness(Business business){
        Result result=new Result();
        try {
            businessService.saveBusiness(business);
            result.setStatus(200);
        } catch (Exception e) {
            result.setStatus(1003);
            result.setMsg(e.getMessage());
        }
        return  result;
    }
}
