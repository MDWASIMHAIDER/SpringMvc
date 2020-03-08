package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PatientSearchDTO implements Serializable {
	
	private int  pid;
	private String pname;
	private String pdept;
	private String address;
}
