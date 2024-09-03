package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
@Entity
public class Appointment extends AuditModel{
	private String date;
	/*@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Doctor doctor;*/	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JsonBackReference
	private Patient patient;

}
