package com.xyzbank.ms_accounts.service.impl;
import com.xyzbank.ms_accounts.model.Account;
import com.xyzbank.ms_accounts.service.AccountService;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    public static List<Account> data = new ArrayList<>(List.of(
            Account.builder().accountNumber("10001").balance(500.00).accountType(Account.AccountType.AHORROS)
                    .dniClient("10203040").build(),
            Account.builder().accountNumber("10002").balance(1500.00).accountType(Account.AccountType.CORRIENTE)
                    .dniClient("10201010").build(),
            Account.builder().accountNumber("10003").balance(250.00).accountType(Account.AccountType.AHORROS)
                    .dniClient("10205050").build(),
            Account.builder().accountNumber("10004").balance(1000.00).accountType(Account.AccountType.CORRIENTE)
                    .dniClient("10206565").build(),
            Account.builder().accountNumber("10005").balance(700.00).accountType(Account.AccountType.AHORROS)
                    .dniClient("102048080").build()));

    @Override
    public List<Account> listAccounts() {
        return data;
    }
//
//    @Override
//    public Account getAccount(int dni) {
//        return data.stream()
//                .filter(dato -> dato.getDniClient() == id)
//                .findFirst()
//                .orElseThrow(() -> new NoSuchElementException("No existe"));
//    }
//
//    @Override
//    public boolean deleteAccount(int id) {
//        return data.removeIf(account -> account.getId()==id);
//    }

}
