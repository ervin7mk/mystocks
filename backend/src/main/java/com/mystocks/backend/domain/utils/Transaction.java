package com.mystocks.backend.domain.utils;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private String holdingIsin;
    private float holdingQuantity;
    private LocalDate transactionDate;
    private TransactionType transactionType;
}
