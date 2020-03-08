package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("collegeBean")//using another way config classn will make it as a bean
//@Component//it make class name as bean id default by using 1st samll letter of clas name (college)
public class College {
	@Value( "tnb college")//for injecting simple value
	private String collegeName;
	
	@Value("${roll}")//accesing property value
	private String roll;
	@Required
	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Autowired//field level autowire if done here the no need of setter method
	Principal principal;
	
	
	//@Autowired//field level autowire
	Teacher teacher;
 /*public College(Principal principal) {
		this.principal = principal;
	}*/

	@Autowired//method level autowire
	@Qualifier("scienceTeacher")//for to exceute first when ambiguty comes in bytype autowiring
public void setTeeacher(Teacher teacher) {
		this.teacher = teacher;
		teacher.teacherInfo();
	}

public Principal getPrincipal() {
	return principal;
}

public Teacher getTeacher() {
	return teacher;
}
//@Autowired//method leevel autowire
public void setPrincipal(Principal principal) {
		this.principal = principal;
		principal.principanInfo();
	}

public void test(String name) {
	principal.principanInfo();
	 System.out.println("college test()"+name);
	 System.out.println("my collge name is "+collegeName);
	 System.out.println("my rolll is  "+Integer.parseInt(roll));
 }
}
