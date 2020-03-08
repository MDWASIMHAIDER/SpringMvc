package com.nt.beans;

public class Vechile {

	private String vname;
	public Vechile() {
		System.out.println("vechile 0-param constructor");
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vechile [vname=" + vname + "]";
	}


}
