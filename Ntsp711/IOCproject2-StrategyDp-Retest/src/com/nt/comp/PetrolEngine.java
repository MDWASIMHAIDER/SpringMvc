package com.nt.comp;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("petrol engine start");
	}

	@Override
	public void start() {
		System.out.println("journey satrted");

	}

	@Override
	public void stop() {
		System.out.println("journey stopped");

	}

}
