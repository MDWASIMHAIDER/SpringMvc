package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

//@Named(dtdc)it performs autowiring byname type constructor apply on field method 
@Named("fpkt")
public class Flipkart {
	@Resource(name="dt")
	private Courier courier;
	public String shopping(String [] items) {
		Random rad=null;
		int orderId=0;
		rad=new Random();
		orderId=rad.nextInt(1000);
		System.out.println(courier.deliver(orderId));
		return 	Arrays.toString(items)+" are delivered";
	}
}
