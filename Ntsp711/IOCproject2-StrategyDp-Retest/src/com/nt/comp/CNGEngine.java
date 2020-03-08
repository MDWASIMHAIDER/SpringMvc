package com.nt.comp;

public class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("cng engine started");
	}

	@Override
	public void start() {
		System.out.println("journey started");

	}

	@Override
	public void stop() {
		System.out.println("journey stop");

	}

}
