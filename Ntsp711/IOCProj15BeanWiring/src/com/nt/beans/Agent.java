package com.nt.beans;

public class Agent {
private TourPlan tp;
private TourPlanPrice price;
	public void setPrice(TourPlanPrice price) {
	this.price = price;
}
	public Agent() {
		System.out.println("agent 0-param constructor");
	}
	
	public Agent(TourPlan tp, TourPlanPrice price) {
		this.tp = tp;
		this.price = price;
		
	}
	public void setTp(TourPlan tp) {
		this.tp=tp;
	}
	@Override
	public String toString() {
		return "Agent [tp=" + tp + ", price=" + price + "]";
	}
	
	
	

}
