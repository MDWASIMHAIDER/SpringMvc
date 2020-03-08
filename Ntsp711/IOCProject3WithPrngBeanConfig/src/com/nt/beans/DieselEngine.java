package com.nt.beans;

public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("diesel engine selected");
	}

	@Override
	public void start() {
		System.out.println("journey started");

	}

	@Override
	public void stop() {
		System.out.println("journey end");

	}

}
