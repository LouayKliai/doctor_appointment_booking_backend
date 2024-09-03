package com.example.demo.service;

import com.example.demo.entity.Patient;


public interface PatientService {
	void deletePatientById(int id);
	void deleteAllPatient();
	Patient addPatient(Patient patient);
	Patient getPatinetById(int id);
	Patient[] getPatientByFirstName(String firstName);
	Patient[] getPatientByLastName(String lastName);
	Patient modifierPatient(int id);
	
	

}
