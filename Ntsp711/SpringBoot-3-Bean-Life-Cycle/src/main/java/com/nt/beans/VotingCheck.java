package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("vc")
public class VotingCheck {
		private int age;
		private String name;
		
		@Value("17")
		public void setAge(int age) {
			this.age = age;
		}
		
		@Value("wasim")
		public void setName(String name) {
			this.name = name;
		}
		@PostConstruct
		public void myInit() {
			System.out.println("VotingCheck.myInit()");
			if(age==0)
				throw new  IllegalArgumentException("age must be greater than 0");
		}
		public String checkVotingEligibilty() {
			if(age<18) {
				return name+" you are not eligible for voting ";
			}
			else {
				return name+" your are eligible for voting";
			}
		}
		@PreDestroy
		public void myDestroy() {
			System.out.println("mydestroy()");
			age=0;
			name=null;
		}
		
}
