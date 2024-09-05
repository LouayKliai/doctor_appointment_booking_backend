package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
	void deleteAppointmentById(int id);
	void deleteAllAppointment();
	Appointment addAppointment(Appointment Appointment);	
	Appointment getAppointmentById(int id);
	List<Appointment> getAllAppointments();
	List<Appointment> getAppointmentByDate(String date);
	Appointment modifierAppointment(int id,Appointment appointment);
	
}
