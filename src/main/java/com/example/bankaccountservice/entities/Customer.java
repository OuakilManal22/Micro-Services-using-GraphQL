package com.example.bankaccountservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor @Data @Builder
public class Customer
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<BankAccount> bankAccounts;
}
