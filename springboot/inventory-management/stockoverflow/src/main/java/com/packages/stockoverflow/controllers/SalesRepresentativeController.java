package com.packages.stockoverflow.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.stockoverflow.entity.SalesRepresentative;
import com.packages.stockoverflow.services.sales_representative.SalesRepServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class SalesRepresentativeController {
    private final SalesRepServices salesRepServices;

    SalesRepresentativeController(SalesRepServices salesRepServices) {
        this.salesRepServices = salesRepServices;
    }

    @PostMapping("createSalesRepAccount")
    public SalesRepresentative createSalesRepsAccount(@RequestBody SalesRepresentative salesRepresentative) {
        return salesRepServices.createSalesRepresentative(salesRepresentative);
    }

    @GetMapping("getAllSalesRepresentatives")
    public List<SalesRepresentative> getAllRepsAccount() {
        return salesRepServices.getAllSalesRepresentatives();
    }
}
