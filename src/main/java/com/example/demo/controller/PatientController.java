package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientServiceImp;

public class PatientController {
	@Autowired
	private PatientServiceImp PatientServ;
	
	
	@PostMapping
	Patient addNewPatient(@RequestBody Patient Patient) {
		return PatientServ.addPatient(Patient);
	}
		
	@GetMapping("/Patients")
	List<Patient> getPatients() {
	return PatientServ.getAllPatients();
	}
	
	@GetMapping("/Patients/{id}")
	Patient getPatientById(@PathVariable int id) {
		return PatientServ.getPatinetById(id);
	}
	
	@GetMapping("/Patients/{firstName}")
	List<Patient> getPatientByFirstName(@PathVariable String firstName) {
		return PatientServ.getPatientByFirstName(firstName);
	}
	@GetMapping("/Patients/{lastName}")
	List<Patient> getPatientByLastName(@PathVariable String lastName) {
		return PatientServ.getPatientByLastName(lastName);
	}
	
	
	@DeleteMapping("/Patients/{id}")
	void deletePatientById(@PathVariable int id) {
		PatientServ.deletePatientById(id);
	}
	@DeleteMapping("/Patients/")
	void deletePatients() {
		PatientServ.deleteAllPatient();
	}

}
