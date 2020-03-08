package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	

 public void test(String name) {
	 System.out.println("college test()"+name);
 }
}
