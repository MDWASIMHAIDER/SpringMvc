package com.nt.beans;

import javax.inject.Named;

@Named("dt")
public class Dtdc implements Courier {
	public Dtdc() {
		System.out.println("Dtdc 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "your order is delivered by dtdc   "+orderId;
	}

}
