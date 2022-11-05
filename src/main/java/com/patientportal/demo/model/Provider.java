package com.patientportal.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data

@NoArgsConstructor

@AllArgsConstructor
public class Provider {
 @Id
 @GeneratedValue
int providerId;

String providerName;

String street;

String city;

String state;

String zipCode;

}