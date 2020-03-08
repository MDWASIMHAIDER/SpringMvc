package com.nt.comp;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("Petrol Engine Selected");
	}

	@Override
	public void start() {
		System.out.println("Journey Started");

	}

	@Override
	public void stop() {
		System.out.println("Journey End");

	}

}
