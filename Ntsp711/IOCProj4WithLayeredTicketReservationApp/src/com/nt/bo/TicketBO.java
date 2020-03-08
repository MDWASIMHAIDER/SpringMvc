package com.nt.bo;

public class TicketBO {
	private String pName;
	private float pAge;
	private String pAddrs;
	private long conatctNumber;
	private String gender;
	private String sourceStation;
	private String destStation;
	private float distance;
	private float amount;
	
	public TicketBO() {
		System.out.println("TicketBO. 0-param constructor");
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getpAge() {
		return pAge;
	}

	public void setpAge(float pAge) {
		this.pAge = pAge;
	}

	public String getpAddrs() {
		return pAddrs;
	}

	public void setpAddrs(String pAddrs) {
		this.pAddrs = pAddrs;
	}

	public long getConatctNumber() {
		return conatctNumber;
	}

	public void setConatctNumber(long conatctNumber) {
		this.conatctNumber = conatctNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
