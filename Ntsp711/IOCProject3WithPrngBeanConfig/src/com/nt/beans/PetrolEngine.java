package com.nt.beans;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("petrol engine selected");
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
