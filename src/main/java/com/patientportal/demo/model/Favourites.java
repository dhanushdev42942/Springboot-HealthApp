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
public class Favourites {

	@Id

	@GeneratedValue

	int favouriteId;

	int userId;

	int doctorId;

	String isActive;

}