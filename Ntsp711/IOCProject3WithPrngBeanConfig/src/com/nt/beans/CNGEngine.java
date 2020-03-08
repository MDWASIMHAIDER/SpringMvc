package com.nt.beans;

public class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("cng engune selected");
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
