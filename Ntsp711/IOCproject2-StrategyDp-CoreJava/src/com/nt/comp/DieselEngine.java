package com.nt.comp;

public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("Diesel Engne Selected");
	}

	@Override
	public void start() {
		System.out.println("Journey Started");

	}

	@Override
	public void stop() {
		System.out.println("Journey end");

	}

}
