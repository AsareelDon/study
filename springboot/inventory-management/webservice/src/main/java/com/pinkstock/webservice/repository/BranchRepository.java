package com.pinkstock.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinkstock.webservice.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
