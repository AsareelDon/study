package com.inventory.stockflow.entity;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
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
@Entity(name = "sales_rep")
public class SalesRepresentative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "firstName", nullable = false, unique = false)
    private String firstName;

    @Column(name = "middleName", nullable = false, unique = false)
    private String middleName;

    @Column(name = "lastName", nullable = false, unique = false)
    private String lastNamae;

    @Column(name = "contactNumber", nullable = false, unique = true)
    private Long contactNumber;

    @Column(name = "address", nullable = false, unique = false)
    private String address;

    @Column(name = "userName", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
}
