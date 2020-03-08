package com.nt.beans;

public class Sim {
	private long simnumber;

	public Sim() {
		System.out.println("sim 0-param constructor");
	}

	public void setSimnumber(long simnumber) {
		this.simnumber = simnumber;
	}

	@Override
	public String toString() {
		return "Sim [simnumber=" + simnumber + "]";
	}

}
