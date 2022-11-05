package com.patientportal.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientportal.demo.repository.PatientPortalRepository;
import com.patientportal.demo.model.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class PatientPortalController {
	
	@Autowired
	PatientPortalRepository patientPortalRepository;
	
	@PostMapping("/userappointments")
	public ResponseEntity<?> createTutorial(@RequestBody UserInput userInput) {
		
	}
	
	@PostMapping("/providers")
	public ResponseEntity<?> createTutorial(@RequestBody ProviderInput providerInput) {
		
	}
	
	@PostMapping("/appointment")
	public ResponseEntity<?> createTutorial(@RequestBody AppointmentInput appointmentdetails) {
//		try {
//			Appointment appointment = 
//			return new ResponseEntity<>(, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createTutorial(@RequestBody AppointmentInput appointmentdetails) {
//		try {
//			Appointment appointment = 
//			return new ResponseEntity<>(, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}
	
	
	
	
}
