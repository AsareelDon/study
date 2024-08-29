package com.pinkstock.webservice.services.Branch;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pinkstock.webservice.entity.Branch;
import com.pinkstock.webservice.repository.BranchRepository;

@Service
public class BranchServicesImp implements BranchServices {
    private final BranchRepository branchRepository;

    public BranchServicesImp(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public void deleteBranchById(Long id) {
        branchRepository.deleteById(id);
    }

    @Override
    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Branch updateBranchById(Branch branch, Long id) {
        branch.setId(id);
        return branchRepository.save(branch);
    }
}
