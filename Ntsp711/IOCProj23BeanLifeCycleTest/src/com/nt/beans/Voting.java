package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Voting  implements InitializingBean,DisposableBean{

	private String name,address;
	private int age;
	public Voting() {
		// TODO Auto-generated constructor stub
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
		System.out.println("bean custon init()");
		if(name==null&&age==0) {
			
			throw new IllegalArgumentException("name and age must be set");
		}
	}
	public String checkVotingEligibilty() {
		if(age<18) {
			return "sorry "+name+" "+"you are not eligible for voting";
		}
		else {
			return name+" you are eligible for voting";
		}
		
	}
	@Override
	public void destroy() {
		System.out.println("BEAN DESTROY CALLED Disposable baean");
		name=null;
		age=0;
		address=null;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean custon init() afterproperttySet");
		if(name==null&&age==0) {
			
			throw new IllegalArgumentException("name and age must be set");
		}
	}
		
	}


