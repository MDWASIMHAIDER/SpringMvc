package com.nt.comp;

import com.nt.factory.VechileFactory;

public class Vechile {
	Engine engine;
	public Vechile() {
		System.out.println("vechile started");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void journey(String startplace,String endplace) {
		/*VechileFactory vec=new VechileFactory();
		vec.getVechileInstance("diesel");*/
		engine.start();
		System.out.println("engine moving");
		System.out.println(startplace+" to "+endplace);
		engine.stop();
	}

}
