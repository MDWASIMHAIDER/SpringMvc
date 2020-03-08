package com.nt.beans;

public class Shoes {
	private String shoeType;
	private String ShoePrice;
	
	
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}


	public void setShoePrice(String shoePrice) {
		ShoePrice = shoePrice;
	}


	@Override
	public String toString() {
		return "Shoes [shoeType=" + shoeType + ", ShoePrice=" + ShoePrice + "]";
	}
	
	
}
