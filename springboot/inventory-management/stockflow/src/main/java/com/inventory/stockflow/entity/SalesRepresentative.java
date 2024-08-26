package com.inventory.stockflow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
