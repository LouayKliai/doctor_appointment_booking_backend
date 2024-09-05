package com.example.demo.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

	final AppointmentRepository appointmentRepo;
	
	@Override
	public void deleteAppointmentById(int id) {
		appointmentRepo.deleteById(id);
		
	}

	@Override
	public void deleteAllAppointment() {
		appointmentRepo.deleteAll();
		
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {		
		return appointmentRepo.save(appointment);
	}

	@Override
	public Appointment getAppointmentById(int id) {		
		return appointmentRepo.getReferenceById(null);
	}

	@Override
	public List<Appointment> getAppointmentByDate(String date) {		
		return appointmentRepo.getAppointmentByDate(date);
	}

	@Override
	public Appointment modifierAppointment(int id, Appointment appointment) {		
		return appointmentRepo.modifierAppointment(id,appointment);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentRepo.getAllAppointments();
	}

	

}
