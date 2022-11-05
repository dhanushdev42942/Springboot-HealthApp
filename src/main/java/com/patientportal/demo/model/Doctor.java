package com.patientportal.demo.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Doctor {

	@Id

	@GeneratedValue

	int doctorId;

	int userId;

	int spclId;

}