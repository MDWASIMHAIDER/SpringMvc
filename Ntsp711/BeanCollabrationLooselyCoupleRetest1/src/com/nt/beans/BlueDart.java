package com.nt.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()-0 param constructor");
	}

	@Override
	public String delivery(int orderid) {
		return "your order number "+orderid+" is delivered by bluedart";
	}

}
