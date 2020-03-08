package com.nt.beans;

public class CheckVoting {

	private String name,address;
	private int age;
	public CheckVoting() {
		System.out.println("votiing 0-param constructor");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void check() {
		System.out.println("Bean custom init()");
		if(name==null ||age<0) {
			throw new IllegalArgumentException("name,age must be set with value");
		}
		
	}
	public String checkVotingEligibility() {
		if(age>=18) {
			return name+"u r eligible to vote"; 
		}
		else {
			return name+"u r not eligible to vote";
		}
	}
	public void myDestroy() {
		System.out.println("bean custom destroy nullyfying the properties done");
		name=null;
		age=0;
		address=null;
		
	}

}
