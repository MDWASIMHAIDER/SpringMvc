package com.nt.comp;

public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("Diesel Engine Satrted");
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
