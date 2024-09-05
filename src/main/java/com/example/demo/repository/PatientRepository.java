package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	void deletePatientById(int id);
	void deleteAllPatient();
	Patient addPatient(Patient patient);
	Patient getPatinetById(int id);
	List<Patient> getPatientByFirstName(String firstName);
	List<Patient> getPatientByLastName(String lastName);
	Patient modifierPatient(int id,Patient patient);
	List<Patient> getAllPatients();
}
