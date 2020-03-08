package com.nt.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
	
	private int[] marks;
	private List<String> name;
	private Map<String,String>  userName;
	private Map<?,?>password;
	private java.util.Date date=null;
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public void setUserName(Map<String, String> userName) {
		this.userName = userName;
	}
	public void setPassword(Map<?, ?> password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", name=" + name + ", userName=" + userName + ", password="
				+ password + ", date=" + date + "]";
	}
	
	
	
	
}
