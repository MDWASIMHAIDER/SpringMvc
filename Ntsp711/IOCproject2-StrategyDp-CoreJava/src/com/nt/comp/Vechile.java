package com.nt.comp;

public class Vechile {
	Engine engine;
	public Vechile() {
		System.out.println("vechile Statrted");
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) { 
		this.engine = engine;
	}
	public void journey(String startplace,String endplace) {
		engine.start();
		System.out.println(startplace+" to "+endplace );
		System.out.println("vechile is moving");
		engine.stop();
		
	}
	
}
