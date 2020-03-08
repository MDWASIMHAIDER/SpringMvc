package com.nt.command;

import lombok.Data;

@Data
public class EmployeeSearchCommand {
	private int eno;
	private String ename;
	private String desg;
	private float salary;
	private int deptno;
	private int mgrno;
	public EmployeeSearchCommand() {
		System.out.println("command 0-param constructor");
	}

}
