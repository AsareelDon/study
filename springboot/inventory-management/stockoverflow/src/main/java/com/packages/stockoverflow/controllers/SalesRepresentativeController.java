package com.packages.stockoverflow.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.stockoverflow.dto.SalesRepresentativeDTO;
import com.packages.stockoverflow.entity.SalesRepresentative;
import com.packages.stockoverflow.services.sales_representative.SalesRepServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1")
public class SalesRepresentativeController {
    private final SalesRepServices salesRepServices;

    SalesRepresentativeController(SalesRepServices salesRepServices) {
        this.salesRepServices = salesRepServices;
    }

    @PostMapping("createSalesRepAccount")
    public ResponseEntity<SalesRepresentative> createSalesRepsAccount(@RequestBody SalesRepresentative salesRepresentative) {
        SalesRepresentative createdNewSalesRepresentative = salesRepServices.createSalesRepresentative(salesRepresentative);
        return new ResponseEntity<>(createdNewSalesRepresentative, HttpStatus.CREATED);
    }

    @GetMapping("getAllSalesRepresentatives")
    public List<SalesRepresentative> getAllRepsAccount() {
        return salesRepServices.getAllSalesRepresentatives();
    }

    @GetMapping("getSalesRepresentative/{id}")
    public ResponseEntity<SalesRepresentativeDTO> getSalesResponseEntityById(@PathVariable("id") Long salesRepId) {
        SalesRepresentativeDTO salesRepresentativeInfo = salesRepServices.getSalesRepById(salesRepId);
        return new ResponseEntity<>(salesRepresentativeInfo, HttpStatus.OK);
    }
    
}
