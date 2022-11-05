package com.patientportal.demo.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity

@Data

@AllArgsConstructor

@NoArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	String firstName;

	String lastName;

	String emailId;

	String password;

	String role;

	int age;

	String gender;

	int phoneNumber;

	String street;

	String city;

	String state;

	int zipCode;
}
