package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary//this is to exceute first when ambiguity comes in bytype autowiring
public class ScienceTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("hii im your science teacher");

	}

}
