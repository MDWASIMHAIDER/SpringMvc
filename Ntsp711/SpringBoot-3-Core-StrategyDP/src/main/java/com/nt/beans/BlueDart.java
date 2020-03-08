package com.nt.beans;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named("bd")
//@Component//both are same making it bean
public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart 0-param constructor");
	}
	@Override
	public String deliver(int orderId) {
		return "your order id delivered by bluedart  "+orderId;
	}

}
