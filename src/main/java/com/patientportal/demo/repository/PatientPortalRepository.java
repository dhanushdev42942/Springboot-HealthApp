package com.patientportal.demo.repository;

import org.springframework.stereotype.Repository;

import com.patientportal.demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientPortalRepository extends JpaRepository<User, Long>{

	
	

}
