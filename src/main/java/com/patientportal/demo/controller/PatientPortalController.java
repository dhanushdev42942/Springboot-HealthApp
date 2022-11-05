package com.patientportal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientportal.demo.model.AppointmentInput;
import com.patientportal.demo.model.ProviderInput;
import com.patientportal.demo.model.User;
import com.patientportal.demo.model.UserInput;
import com.patientportal.demo.repository.PatientPortalRepository;
import com.patientportal.demo.service.PatientPortalService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class PatientPortalController {
	
	@Autowired(required=true)
	PatientPortalRepository patientPortalRepository;
	
	@Autowired(required=true)
	PatientPortalService patientPortalService;
	
	@PostMapping("/userappointments")
	public ResponseEntity<?> createTutorial(@RequestBody UserInput userInput) {
		return null;
		
	}
	
	@PostMapping("/providers")
	public ResponseEntity<?> createTutorial(@RequestBody ProviderInput providerInput) {
		return null;
		
	}
	
	@PostMapping("/appointment")
	public ResponseEntity<?> createTutorial(@RequestBody AppointmentInput appointmentdetails) {
		return null;
//		try {
//			Appointment appointment = 
//			return new ResponseEntity<>(, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}

	  @PostMapping("/addUser")
	    public User addProduct(@RequestBody User user) {
	        return patientPortalService.saveUser(user);

	    }
	
}
