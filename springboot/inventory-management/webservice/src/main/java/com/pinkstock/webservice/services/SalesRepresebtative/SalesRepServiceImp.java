package com.pinkstock.webservice.services.SalesRepresebtative;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pinkstock.webservice.entity.SalesRepresentative;
import com.pinkstock.webservice.repository.SalesRepRepository;

@Service
public class SalesRepServiceImp implements SalesRepService {
    private final SalesRepRepository salesRepRepository;

    public SalesRepServiceImp(SalesRepRepository salesRepRepository) {
        this.salesRepRepository = salesRepRepository;
    }

    @Override
    public List<SalesRepresentative> findAllData() {
        return salesRepRepository.findAll();
    }

    @Override
    public Optional<SalesRepresentative> findById(Long id) {
        return salesRepRepository.findById(id);
    }

    @Override
    public SalesRepresentative createData(SalesRepresentative salesRepresentative) {
        return salesRepRepository.save(salesRepresentative);
    }

    @Override
    public SalesRepresentative updateData(SalesRepresentative salesRepresentative, Long id) {
        salesRepresentative.setId(id);
        return salesRepRepository.save(salesRepresentative);
    }

    @Override
    public void deleteData(Long id) {
        salesRepRepository.deleteById(id);
    }
}
