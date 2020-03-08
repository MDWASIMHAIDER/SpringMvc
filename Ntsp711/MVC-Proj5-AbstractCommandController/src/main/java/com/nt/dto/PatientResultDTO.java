package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PatientResultDTO implements Serializable {
	
	private int  pid;
	private String pname;
	private String pdept;
	private String address;
	private String tstatus;
	private float tbill;
}
