package com.mystocks.backend.domain;

import java.util.List;

import com.mystocks.backend.domain.utils.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String username;
    private List<Transaction> transactions;
}
