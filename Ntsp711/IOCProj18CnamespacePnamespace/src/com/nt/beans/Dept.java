package com.nt.beans;

import java.util.Date;

public class Dept {

	private int deptno;
	private String name;
	private Date date;
	
	
	public Dept(int deptno, String name, Date date) {
		this.deptno = deptno;
		this.name = name;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", name=" + name + ", date=" + date + "]";
	}
	

}
