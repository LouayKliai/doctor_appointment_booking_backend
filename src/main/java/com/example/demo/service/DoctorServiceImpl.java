package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {	
	final DoctorRepository doctorRepo;

	@Override
	public void deleteDoctorById(int id) {
		doctorRepo.deleteById(id);
		
	}

	@Override
	public void deleteAllDoctor() {
		doctorRepo.deleteAll();
		
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {		
		return doctorRepo.save(doctor);
	}

	public Doctor[] getDoctorByFirstName(String firstName) {	
		return doctorRepo.getDoctorByFirstName(firstName);
	}

	public Doctor[] getDoctorByLastName(String lastName) {
		
		return doctorRepo.getDoctorByLastName(lastName);
	}
	
	@Override
	public Doctor getDoctorById(int id) {		
		return doctorRepo.getReferenceById(id);
	}

	@Override
	public Doctor modifierDoctor(int id) {
		if(doctorRepo.existsById(id)) {
			Doctor newDoctor=doctorRepo.getReferenceById(id);
			doctorRepo.save(newDoctor);
		}
		return null;
	}

	@Override
	public List<Doctor> getAllDoctors() {		
		//return doctorRepo.findAll();
		return null;
	}

	

}
