package com.nt.bo;

import lombok.Data;

@Data
public class PatientResultBO {
	private int  pid;
	private String pname;
	private String pdept;
	private String address;
	private String tstatus;
	private float tbill;
}
