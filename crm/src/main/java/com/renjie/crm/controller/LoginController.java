package com.renjie.crm.controller;

import com.renjie.crm.entity.Account;
import com.renjie.crm.service.AccountService;
import com.renjie.crm.until.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    final
    AccountService accountService;

    public LoginController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    String Login() {
        return "index";
    }

    @PostMapping("login")
    @CrossOrigin
    @ResponseBody
    Result Login(@RequestBody Account account) {
        Result result = new Result();
        try {
            account = accountService.checkAccount(account);
            result.setMsg("登陆成功");
            result.setStatus(200);
            result.setData(account);
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            result.setStatus(203);
        }
        return result;
    }
}
