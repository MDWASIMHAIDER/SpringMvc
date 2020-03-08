package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_DATA")
public class Employee  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	@Column(name="ENAME")
	private String ename;
	@Column(name="EMAIL")
	private String email;
	@Column(name="SALARY")
	private int salary;
}
