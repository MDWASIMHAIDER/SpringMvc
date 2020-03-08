package com.nt.beans;

public class Bike {
	
	private String id;
	private String make;
	private String engineCC;
	public Bike() {
		System.out.println("bike 0-param constructor");
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", make=" + make + ", engineCC=" + engineCC + "]";
	}
	

}
