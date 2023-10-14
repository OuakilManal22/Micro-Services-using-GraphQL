package com.example.bankaccountservice.web;

import com.example.bankaccountservice.BankAccountServiceApplication;
import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.mappers.AccountMapper;
import com.example.bankaccountservice.repositories.BankAccountRepository;
import com.example.bankaccountservice.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AccountRestController
{
    private BankAccountRepository bankAccountRepository;
    private AccountService bankAccountServiceApplication;
    private AccountMapper accountMapper;

    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts()
    {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id)
    {
        return bankAccountRepository.findById(id).orElseThrow();
    }
    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO)
    {return bankAccountServiceApplication.addAccount(requestDTO);
    }
    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@PathVariable String id, @RequestBody BankAccount bankAccount)
    {
        BankAccount account = bankAccountRepository.findById(id).orElseThrow();
        if(bankAccount.getBalance()!=null) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getCreatedAt()!=null) account.setCreatedAt(bankAccount.getCreatedAt());
        if(bankAccount.getType()!=null)account.setType(bankAccount.getType());
        if(bankAccount.getCurrency()!=null) account.setCurrency(bankAccount.getCurrency());
        return bankAccountRepository.save(bankAccount);
    }
    @DeleteMapping("/bankAccounts/{id}")
    public void delete(@PathVariable String id)
    {
         bankAccountRepository.deleteById(id);
    }
}
