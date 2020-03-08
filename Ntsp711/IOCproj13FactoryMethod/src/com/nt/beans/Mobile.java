package com.nt.beans;

public class Mobile {
	
	private long mobileSno;
	private Sim sim;

	public Mobile() {
		System.out.println("mobile 0-param constructor");
	}
	public void setMobileSno(long mobileSno) {
		this.mobileSno = mobileSno;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public Sim getSim() {
		return sim;
	}
	@Override
	public String toString() {
		return "Mobile [mobileSno=" + mobileSno + "]";
	}
	
	
}
