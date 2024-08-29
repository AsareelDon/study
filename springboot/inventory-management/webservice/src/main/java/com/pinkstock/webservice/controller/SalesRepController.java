package com.pinkstock.webservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinkstock.webservice.entity.SalesRepresentative;
import com.pinkstock.webservice.services.SalesRepresebtative.SalesRepService;

@RestController
@RequestMapping("/api/v1")
public class SalesRepController {
    private final SalesRepService salesRepService;

    public SalesRepController(SalesRepService salesRepService) {
        this.salesRepService = salesRepService;
    }

    @PostMapping("createdata")
    public SalesRepresentative createData(@RequestBody SalesRepresentative salesRepresentative) {
        return salesRepService.createData(salesRepresentative);
    }
}
