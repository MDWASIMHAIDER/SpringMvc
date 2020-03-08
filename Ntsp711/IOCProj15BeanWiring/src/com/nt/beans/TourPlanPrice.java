package com.nt.beans;

public class TourPlanPrice {

	private float price;
	public void setPrice(float price) {
		this.price = price;
	}
	public TourPlanPrice() {
		System.out.println("price 0-param constructor");
	}
	@Override
	public String toString() {
		return "TourPlanPrice [price=" + price + "]";
	}

}
