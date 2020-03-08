package com.nt.beans;

public class CngEngine implements Engine {

	public CngEngine() {
		System.out.println("CNG 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNG engine started");

	}

	@Override
	public void stop() {
		System.out.println("CNG engine stopped");

	}

}
