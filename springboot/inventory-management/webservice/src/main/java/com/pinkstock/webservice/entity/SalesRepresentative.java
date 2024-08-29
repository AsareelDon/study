package com.pinkstock.webservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "sales_reps")
public class SalesRepresentative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesrep_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "middleName", nullable = false)
    private String middleName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "contactNumber", nullable = false)
    private Long contactNumber;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "userName", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;
}
