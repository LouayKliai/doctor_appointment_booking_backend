package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;


public interface PatientService {
	void deletePatientById(int id);
	void deleteAllPatient();
	Patient addPatient(Patient patient);
	Patient getPatinetById(int id);
	List<Patient> getPatientByFirstName(String firstName);
	List<Patient> getPatientByLastName(String lastName);
	Patient modifierPatient(int id,Patient patient);
	List<Patient> getAllPatients();
	

}
