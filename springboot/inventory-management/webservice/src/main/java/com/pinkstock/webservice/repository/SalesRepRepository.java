package com.pinkstock.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinkstock.webservice.entity.SalesRepresentative;

@Repository
public interface SalesRepRepository extends JpaRepository<SalesRepresentative, Long> {

}
