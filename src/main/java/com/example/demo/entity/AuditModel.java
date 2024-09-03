package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AuditModel implements Serializable {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int id;

}
