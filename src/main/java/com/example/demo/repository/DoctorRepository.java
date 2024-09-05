package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	Doctor[] getDoctorByFirstName(String firstName);
	Doctor[] getDoctorByLastName(String lastName);
	Doctor[] getAllDoctors();
}
