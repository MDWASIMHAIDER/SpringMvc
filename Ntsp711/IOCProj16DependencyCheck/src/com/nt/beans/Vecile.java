package com.nt.beans;

public class Vecile {

	private Engine engine;
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Vecile() {
		System.out.println("vechile 0-param constructor");
	}
	@Override
	public String toString() {
		return "Vecile [engine=" + engine + ", id=" + id + "]";
	}

	}


