package com.nt.command;

import lombok.Data;

@Data
public class PatientSearchCommand {
	private int  pid;
	private String pname;
	private String pdept;
	private String address;
}
