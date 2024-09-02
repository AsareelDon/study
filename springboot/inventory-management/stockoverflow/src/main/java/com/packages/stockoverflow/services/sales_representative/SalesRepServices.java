package com.packages.stockoverflow.services.sales_representative;

import java.util.List;

import com.packages.stockoverflow.entity.SalesRepresentative;

public interface SalesRepServices {
    SalesRepresentative createSalesRepresentative(SalesRepresentative salesRepresentative);
    List<SalesRepresentative> getAllSalesRepresentatives();
}
