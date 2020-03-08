package com.nt.beans;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("im your math teacher");

	}

}
