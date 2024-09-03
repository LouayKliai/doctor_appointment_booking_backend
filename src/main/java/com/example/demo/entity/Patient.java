package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
@Entity
public class Patient extends AuditModel{
	private String firstName;	
	private String lastName;
	private Date dateOfBirth;
	private String address;
	private long cin;
	private String photo;
	private int phoneNumber;
	private int age;
	@OneToMany	
	private Appointment[] appointmentList;

}
