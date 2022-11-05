package com.patientportal.demo.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity

@Data

@AllArgsConstructor

@NoArgsConstructor

public class Appointment {

	@Id

	@GeneratedValue

	int userId;

	int doctorId;

	int providerId;

	String date;

	String startTime;

	String endTime;

	String status;

	String notes;

}