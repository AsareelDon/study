package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {

}
