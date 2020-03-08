package com.nt.beans;

import java.util.Random;

public class Flipkart {
Courier courier;
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()-0 param constructor");
	}
	
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String shopping(String[] item,float[] price) {
			float totalamount=0.0f;
			
			int orderid=0;
			String status=null;
			Random rad=new Random();
			orderid=rad.nextInt(10000);
			status=courier.delivery(orderid);
			for(int i=0;i<price.length;i++) {
				totalamount+=price[i];
				System.out.println(item[i]);
			
				
			}
			return status+" and total amount of your cart is"+totalamount;
	}

}
