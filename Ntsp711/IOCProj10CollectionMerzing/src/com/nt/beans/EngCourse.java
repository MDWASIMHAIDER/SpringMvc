package com.nt.beans;

import java.util.List;

public class EngCourse {

	private List<String> subject;
	public EngCourse() {
		System.out.println("eng cousre 0-param constructor");
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "EngCourse [subject=" + subject + "]";
	}

}
