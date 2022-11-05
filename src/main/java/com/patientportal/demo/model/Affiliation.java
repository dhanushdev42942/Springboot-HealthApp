package com.patientportal.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Affiliation {

 @Id
 @GeneratedValue
 int affiliationId;

 int providerId;

 int doctorId;

String isActive;


}