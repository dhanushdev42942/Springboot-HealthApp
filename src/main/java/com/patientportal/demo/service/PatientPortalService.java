package com.patientportal.demo.service;

import java.util.List;

import com.patientportal.demo.model.User;

public interface PatientPortalService {



	User saveUser(User user);

	List<User> getProducts();

}
