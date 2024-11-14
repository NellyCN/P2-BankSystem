package com.xyzbank.ms_accounts.controller;

//import com.xyzbank.ms_accounts.model.Account;
import com.xyzbank.ms_accounts.service.AccountService;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")

public class AccountController {

//    private final AccountService accountService;

    @GetMapping("/accounts")
    public void viewAccounts(@RequestHeader Map<String, String> headers) {
        System.out.printf("hola");
//        return accountService.listAccounts();
    }


}