package com.nt.beans;

public class Computer {

	private String cname;
	public Computer() {
		System.out.println("computer 0-param constructor");
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Computer [cname=" + cname + "]";
	}

}
