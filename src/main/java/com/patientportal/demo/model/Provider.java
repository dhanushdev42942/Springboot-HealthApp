package com.patientportal.demo.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

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