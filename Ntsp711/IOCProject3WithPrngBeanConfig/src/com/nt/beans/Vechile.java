package com.nt.beans;

public class Vechile {
	Engine engine;
	public Vechile() {
		System.out.println("vechile started");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void journey(String startplace,String endplace) {
			engine.start();
			System.out.println("vechile is moving");
			System.out.println(startplace+" to "+endplace);
			engine.stop();
	}
	

}
