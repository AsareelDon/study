package com.pinkstock.webservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinkstock.webservice.entity.Branch;
import com.pinkstock.webservice.services.Branch.BranchServices;

@RestController
@RequestMapping("/api/v1")
public class BranchController {
    private final BranchServices branchServices;

    public BranchController(BranchServices branchServices) {
        this.branchServices = branchServices;
    }

    @GetMapping("branches")
    public List<Branch> getAllBranches() {
        return branchServices.getAllBranches();
    }
    
    @PostMapping("create_branch")
    public Branch createBranch(@RequestBody Branch branch) {
        return branchServices.createBranch(branch);
    }

    @GetMapping("branch/{id}")
    public Optional<Branch> getBranchById(@PathVariable("id") Long id) {
        return branchServices.getBranchById(id);
    }

    @PutMapping("update_branch/{id}")
    public Branch updateBranchById(@RequestBody Branch branch, @PathVariable Long id) {
        return branchServices.updateBranchById(branch, id);
    }

    @DeleteMapping("delete_branch/{id}")
    public void deleteBranchById(@PathVariable("id") Long id) {
        branchServices.deleteBranchById(id);
    } 
}
