package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;

public interface AccountService
{
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO banAccountDTO);

    BankAccountResponseDTO update(String id, BankAccountRequestDTO bankAccountDTO);
}
