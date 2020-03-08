package com.nt.beans;

public class Dtdc implements Courier{

	public Dtdc() {
		System.out.println("Dtdc.Dtdc()-0 param construcor");
	}
	@Override
	public String delivery(int orderid) {
		return orderid+" "+"order number is ready to deliver by dtdc";
	}

}
