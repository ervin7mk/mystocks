package com.mystocks.backend.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Etf {
    private String name;
    private String ticker;
    private String isin;
    private LocalDate launchDate;
    private String currency;
    private float ter;
    private String useOfIncome;
    private String benchmark;
}
