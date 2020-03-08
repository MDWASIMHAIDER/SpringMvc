package com.nt.beans;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine stopped");

	}

}
