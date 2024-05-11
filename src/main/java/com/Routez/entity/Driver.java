package com.Routez.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driverName;
    private String driverLicenseNumber;
    private String adharNumber;
    private String address;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;

//    @OneToOne(mappedBy = "driver")
//    private Bus bus;


}

