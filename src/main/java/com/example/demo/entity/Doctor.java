package com.example.demo.entity;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Doctor extends AuditModel{
	private String firstName;	
	private String lastName;
	private Speciality speciality;
	private Date dateOfBirth;
	private long cin;
	private String photo;
	private String adresse;
	private int phoneNumber;
/*	@OneToMany
	@JsonBackReference
	private Patient[] patientList;
*/


}
