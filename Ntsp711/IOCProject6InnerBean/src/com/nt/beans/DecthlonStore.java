package com.nt.beans;

public class DecthlonStore {
	KalanjeeShoe showStore;
	public DecthlonStore(KalanjeeShoe showStore) {

		this.showStore = showStore;
	}
/*	String sType;
	int sPrice;
	public DecthlonStore(String sType,int sPrice) {
		this.sType=sType;
		this.sPrice=sPrice;
	}*/
	@Override
	public String toString() {
		return "DecthlonStore [" + showStore + "]";
	}
	
	

}
