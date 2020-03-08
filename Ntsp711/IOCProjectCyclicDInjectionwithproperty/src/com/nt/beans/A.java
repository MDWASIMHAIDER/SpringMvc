package com.nt.beans;

public class A {
	B b;

	public void setB(B b) {
		this.b=b;
		System.out.println("A class");
	}
	@Override
	public String toString() {
		return "A [b="+ b + "]";
	}
	
	

}
