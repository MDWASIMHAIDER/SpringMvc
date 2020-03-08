package com.nt.beans;

import java.util.Random;

public class Flipkart  {
	Courier courier;
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()-0 param constructor");
	}
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	public String shopping(String[] item,float[] price) {
		float totalprice=0.0f;
		Random rad=null;
		rad=new Random();
		int orderid=rad.nextInt(1000);
		String status=courier.delivery(orderid);
		for(int i=0;i<price.length;i++) {
			totalprice=+price[i];
			
		}
		System.out.println(totalprice+" "+status);
		return status+" bill amoutn for id  "+orderid+" is "+totalprice;
	}
	
	

}
