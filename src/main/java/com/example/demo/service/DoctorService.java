package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {
	void deleteDoctorById(int id);
	void deleteAllDoctor();
	Doctor addDoctor(Doctor doctor);	
	Doctor getDoctorById(int id);
	Doctor[] getDoctorByFirstName(String firstName);
	Doctor[] getDoctorByLastName(String lastName);
	Doctor modifierDoctor(int id);
	
	List<Doctor> getAllDoctors();

}
