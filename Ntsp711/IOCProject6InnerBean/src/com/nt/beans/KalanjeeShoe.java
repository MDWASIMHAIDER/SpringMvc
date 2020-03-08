package com.nt.beans;

public class KalanjeeShoe {
	
	String shoeType;
	String shoePrice;
	/*public KalanjeeShoe() {
		// TODO Auto-generated constructor stub
	}*/
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	public void setShoePrice(String shoePrice) {
		this.shoePrice = shoePrice;
	}
	@Override
	public String toString() {
		return "KalanjeeShoe [shoeType=" + shoeType + ", shoePrice=" + shoePrice + "]";
	}
	


}
