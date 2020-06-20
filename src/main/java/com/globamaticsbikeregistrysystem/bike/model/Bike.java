package com.globamaticsbikeregistrysystem.bike.model;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
public class Bike {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;
    private Date purchaseDate;
    private boolean contact;
}
