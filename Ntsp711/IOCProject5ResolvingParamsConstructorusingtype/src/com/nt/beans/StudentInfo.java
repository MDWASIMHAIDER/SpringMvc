package com.nt.beans;

public class StudentInfo {

	private int sno;
	private String name;
	private float avg;
	public StudentInfo(int sno,String name,float avg) {
		System.out.println("Studentinfo 0-param constructor using type" );
		this.sno=sno;
		this.name=name;
		this.avg=avg;
	}
	@Override
	public String toString() {
		return "StudentInfo [sno=" + sno + ", name=" + name + ", avg=" + avg + "]";
	}
	
	

}
