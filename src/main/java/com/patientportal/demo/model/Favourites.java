package com.patientportal.demo.model;

import javax.persistence.GeneratedValue;

import javax.persistence.Entity;
import org.springframework.data.annotation.Id;

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