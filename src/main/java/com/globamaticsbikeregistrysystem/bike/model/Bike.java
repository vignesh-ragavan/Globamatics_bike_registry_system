package com.globamaticsbikeregistrysystem.bike.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;


@Entity
public class Bike {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;
 @JsonFormat (shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
    private Date purchaseDate;
    private String contact;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getSerialNumber() {
  return serialNumber;
 }

 public void setSerialNumber(String serialNumber) {
  this.serialNumber = serialNumber;
 }

 public BigDecimal getPurchasePrice() {
  return purchasePrice;
 }

 public void setPurchasePrice(BigDecimal purchasePrice) {
  this.purchasePrice = purchasePrice;
 }

 public Date getPurchaseDate() {
  return purchaseDate;
 }

 public void setPurchaseDate(Date purchaseDate) {
  this.purchaseDate = purchaseDate;
 }

 @Override
 public String toString() {
  return "Bike{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", email='" + email + '\'' +
          ", phone='" + phone + '\'' +
          ", model='" + model + '\'' +
          ", serialNumber='" + serialNumber + '\'' +
          ", purchasePrice=" + purchasePrice +
          ", purchaseDate=" + purchaseDate +
          ", contact=" + contact +
          '}';
 }

 public String Contact() {
  return contact;
 }

 public void setContact(String contact) {
  this.contact = contact;
 }
}
