package com.example.demo.service;

import com.example.demo.entity.Appointment;

public interface AppointmentService {
	void deleteAppointmentById(int id);
	void deleteAllAppointment();
	Appointment addAppointment(Appointment Appointment);	
	Appointment getAppointmentById(int id);
	Appointment getAppointmentByDate(String date);
	Appointment modifierAppointment(int id);
	

}
