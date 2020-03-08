package com.nt.beans;

public class Vechile {

	Engine engn;
	public Vechile() {
		System.out.println("Vechile 0-param constructor");
	}
	public void setEngine(Engine engn) {
		System.out.println("Vechile setEnine");
		this.engn=engn;
	}
	public void journey(String startplace,String endplace) {
		engn.start();
		System.out.println("journey is started from "+startplace);
		engn.stop();
		System.out.println("destination arrived "+endplace);
	}

}
