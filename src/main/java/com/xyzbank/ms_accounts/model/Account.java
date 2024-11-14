package com.xyzbank.ms_accounts.model;

//import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
//@Entity
public class Account {
//    private Long id;
    private String accountNumber;
    private double balance=0.0;
    private AccountType accountType;
    private String dniClient;

    public enum AccountType {       // Se crea el tipo de dato enum
        AHORROS, CORRIENTE
    }
}
