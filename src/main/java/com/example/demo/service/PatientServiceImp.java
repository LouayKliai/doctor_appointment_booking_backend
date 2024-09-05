package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImp implements PatientService {

	final PatientRepository patientRepo;
	@Override
	public void deletePatientById(int id) {
		patientRepo.deletePatientById(id);
		
	}

	@Override
	public void deleteAllPatient() {
		patientRepo.deleteAll();
		
	}

	@Override
	public Patient addPatient(Patient patient) {
		return patientRepo.addPatient(patient);
	}

	@Override
	public Patient getPatinetById(int id) {		
		return patientRepo.getPatinetById(id);
	}

	@Override
	public List<Patient> getPatientByFirstName(String firstName) {		
		return patientRepo.getPatientByFirstName(firstName);
	}

	@Override
	public List<Patient> getPatientByLastName(String lastName) {
		return patientRepo.getPatientByLastName(lastName);
	}

	@Override
	public Patient modifierPatient(int id,Patient patient) {		
		return patientRepo.modifierPatient(id,patient);
	}

	@Override
	public List<Patient> getAllPatients() {		
		return patientRepo.getAllPatients();
	}

}
