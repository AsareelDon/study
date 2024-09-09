package com.packages.stockoverflow.dto.mapper;

import com.packages.stockoverflow.dto.SalesRepresentativeDTO;
import com.packages.stockoverflow.entity.SalesRepresentative;

public class SalesRepresentativeMapper {
    public static SalesRepresentativeDTO convSalesRepresentativeToDTO(SalesRepresentative salesRepresentative) {
        SalesRepresentativeDTO salesRepDTO = new SalesRepresentativeDTO();
        salesRepDTO.setId(salesRepresentative.getSalesrep_id());
        salesRepDTO.setFirstname(salesRepresentative.getFirstname());
        salesRepDTO.setMiddlename(salesRepresentative.getMiddlename());
        salesRepDTO.setLastname(salesRepresentative.getLastname());
        salesRepDTO.setEmail(salesRepresentative.getUserEmail());
        return salesRepDTO;
    }
}
