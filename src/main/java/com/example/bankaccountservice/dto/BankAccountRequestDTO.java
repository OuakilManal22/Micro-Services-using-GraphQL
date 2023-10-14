package com.example.bankaccountservice.dto;

import com.example.bankaccountservice.entities.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccountRequestDTO
{
    private Double balance;
    private String currency;
    private AccountType type;
}
