package com.nt.beans;

public class Dtdc implements Courier {

	public Dtdc() {
		System.out.println("Dtdc.Dtdc()-0 param construrctor");
	}

	@Override
	public String delivery(int orderid) {
		return "your order number "+orderid+" is delivered by dtdc";
	}

}
