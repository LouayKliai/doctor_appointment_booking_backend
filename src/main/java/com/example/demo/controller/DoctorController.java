package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;
import com.example.demo.service.DoctorServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	@Autowired
	private DoctorServiceImpl doctorServ;
	
	
	@PostMapping
	Doctor addNewDoctor(@RequestBody Doctor doctor) {
		return doctorServ.addDoctor(doctor);
	}
		
	@GetMapping("/doctors")
	List<Doctor> getDoctors() {
	return doctorServ.getAllDoctors();
	}
	
	@GetMapping("/doctors/{id}")
	Doctor getDoctorById(@PathVariable int id) {
		return doctorServ.getDoctorById(id);
	}
	
	@GetMapping("/doctors/{firstName}")
	Doctor[] getDoctorByFirstName(@PathVariable String firstName) {
		return doctorServ.getDoctorByFirstName(firstName);
	}
	@GetMapping("/doctors/{lastName}")
	Doctor[] getDoctorByLastName(@PathVariable String lastName) {
		return doctorServ.getDoctorByLastName(lastName);
	}
	
	
	@DeleteMapping("/doctors/{id}")
	void deleteDoctorById(@PathVariable int id) {
		doctorServ.deleteDoctorById(id);
	}
	@DeleteMapping("/doctors/")
	void deleteDoctors() {
		doctorServ.deleteAllDoctor();
	}

}
