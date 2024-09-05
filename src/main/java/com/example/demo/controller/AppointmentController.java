package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentServiceImpl;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	@Autowired
	private AppointmentServiceImpl AppointmentServ;
	
	
	@PostMapping
	Appointment addNewAppointment(@RequestBody Appointment Appointment) {
		return AppointmentServ.addAppointment(Appointment);
	}
	
	
	@GetMapping("/Appointments")
	List<Appointment> getAppointments() {
	return AppointmentServ.getAllAppointments();
	}
	
	@GetMapping("/Appointments/{id}")
	Appointment getAppointmentById(@PathVariable int id) {
		return AppointmentServ.getAppointmentById(id);
	}
	
	
	@GetMapping("/Appointments/{date}")
	List<Appointment> getAppointmentByDate(@PathVariable String date) {
		return AppointmentServ.getAppointmentByDate(date);
	}

	
	@DeleteMapping("/Appointments/{id}")
	void deleteAppointmentById(@PathVariable int id) {
		AppointmentServ.deleteAppointmentById(id);
	}
	@DeleteMapping("/Appointments/")
	void deleteAppointments() {
		AppointmentServ.deleteAllAppointment();
	}
	
	@PutMapping("/modifierAppointment/{id}/{appoint}")
	Appointment modifierAppointment(@PathVariable int id,@RequestBody Appointment appoint) {
		return AppointmentServ.modifierAppointment(id, appoint);
		
	}


}
