package com.example.parabank.accounting.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer Employee_ID;
	@Column(name = "employee_name",length = 50,nullable = false)
	private String Employee_name;
	@Column(name = "employee_pet")
	private Integer Employee_pet_id;
	
}
