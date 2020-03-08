package com.nt.bo;

import java.util.Date;

import lombok.Data;

@Data
public class RegistrationBO {
	//private int cid;
	private String name;
	private String geneder;
	private String address;
	private String dob;
	private String qualification;
	private String desg;
	private float salary;
	private String expected_desg;
	private String expected_intrest;
	private float expected_age;
}
