package com.nt.beans;

public class B {
	A a;
	public B(A a) {
		this.a=a;
		System.out.println("B class");
	}
	public void test() {
		System.out.println("b executed");
	}
	@Override
	public String toString() {
		return "B [a="+10;// + a + "]";
	}
	

}
