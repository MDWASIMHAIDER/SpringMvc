package com.nt.comp;

public class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("Cng Engine Sekected");
	}

	@Override
	public void start() {
		System.out.println("Journey started using ");

	}

	@Override
	public void stop() {
		System.out.println("Journey end");

	}

}
