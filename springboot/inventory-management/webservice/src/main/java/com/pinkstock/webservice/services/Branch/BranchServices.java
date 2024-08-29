package com.pinkstock.webservice.services.Branch;

import java.util.List;
import java.util.Optional;

import com.pinkstock.webservice.entity.Branch;

public interface BranchServices {
    List<Branch> getAllBranches();

    Optional<Branch> getBranchById(Long id);

    Branch createBranch(Branch branch);

    Branch updateBranchById(Branch branch, Long id);
    
    void deleteBranchById(Long id);
}
