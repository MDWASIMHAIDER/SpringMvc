package com.nt.beans;

public class B {
	A a;

	public void setA(A a) {
		this.a=a;
		System.out.println("B class");
	}
	@Override
	public String toString() {
		return "B [a="+10;// + a + "]";
	}
	

}
