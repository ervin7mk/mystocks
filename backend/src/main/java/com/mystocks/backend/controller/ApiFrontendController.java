package com.mystocks.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mystocks.backend.domain.Etf;
import com.mystocks.backend.service.StockManager;

@RestController
@RequestMapping("/api")
public class ApiFrontendController {

    private final StockManager stockManager;

    public ApiFrontendController(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    @GetMapping("/etf")
    public List<Etf> getAllEtfs() {
        return stockManager.getAllEtfs();
    }
    
}
