package com.nt.beans;

public class Engine {

	private String type;
	public Engine() {
		System.out.println("engine-0-param constructor");
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}

}
