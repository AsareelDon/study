package com.packages.stockoverflow.services.sales_representative.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.packages.stockoverflow.dto.SalesRepresentativeDTO;
import com.packages.stockoverflow.dto.mapper.SalesRepresentativeMapper;
import com.packages.stockoverflow.entity.SalesRepresentative;
import com.packages.stockoverflow.repository.SalesRepresentativeRepo;
import com.packages.stockoverflow.services.sales_representative.SalesRepServices;

@Service
public class SalesRepServicesImp implements SalesRepServices {
    private final SalesRepresentativeRepo salesRepresentativeRepo;

    SalesRepServicesImp(SalesRepresentativeRepo salesRepresentativeRepo) {
        this.salesRepresentativeRepo = salesRepresentativeRepo;
    }

    @Override
    public SalesRepresentative createSalesRepresentative(SalesRepresentative salesRepresentative) {
        return salesRepresentativeRepo.save(salesRepresentative);
    }

    @Override
    public List<SalesRepresentative> getAllSalesRepresentatives() {
        return salesRepresentativeRepo.findAll();
    }

    @Override
    public SalesRepresentativeDTO getSalesRepById(Long salesRepId) {
        Optional<SalesRepresentative> salesRepInfo = salesRepresentativeRepo.findById(salesRepId);
        return SalesRepresentativeMapper.convSalesRepresentativeToDTO(salesRepInfo.get());
    }
    
}
