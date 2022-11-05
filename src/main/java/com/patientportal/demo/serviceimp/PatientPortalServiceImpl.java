package com.patientportal.demo.serviceimp;

import com.patientportal.demo.model.User;
import com.patientportal.demo.repository.PatientPortalRepository;
import com.patientportal.demo.service.PatientPortalService;

import org.springframework.beans.factory.annotation.Autowired;

public class PatientPortalServiceImpl implements PatientPortalService {

	@Autowired(required=true)
	PatientPortalRepository patientPortalRepository;
	
	
	public User saveUser(User user) {
		 return patientPortalRepository.save(user);
	}

}
