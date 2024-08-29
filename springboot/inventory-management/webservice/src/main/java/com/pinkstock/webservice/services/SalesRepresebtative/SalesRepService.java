package com.pinkstock.webservice.services.SalesRepresebtative;

import java.util.List;
import java.util.Optional;

import com.pinkstock.webservice.entity.SalesRepresentative;

public interface SalesRepService {
    List<SalesRepresentative> findAllData();
    Optional<SalesRepresentative> findById(Long id);
    SalesRepresentative createData(SalesRepresentative salesRepresentative);
    SalesRepresentative updateData(SalesRepresentative salesRepresentative, Long id);
    void deleteData(Long id);
}
