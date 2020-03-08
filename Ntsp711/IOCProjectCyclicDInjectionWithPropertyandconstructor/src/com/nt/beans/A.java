package com.nt.beans;

public class A {
	B b;
	public void setB(B b) {
		this.b=b;
		b.test();
		System.out.println("A class");
	}
	@Override
	public String toString() {
		return "A [b="+ b + "]";
	}
	
	

}
