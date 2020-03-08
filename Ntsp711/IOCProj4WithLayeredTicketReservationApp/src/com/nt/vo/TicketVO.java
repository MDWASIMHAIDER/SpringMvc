package com.nt.vo;

public class TicketVO {
	
	private String pName;
	private String pAge;
	private String pAddrs;
	private String conatctNumber;
	private String gender;
	private String sourceStation;
	private String destStation;
	private String distance;
	
	public TicketVO() {
		System.out.println("TicketVO.-0-param constructor");
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAge() {
		return pAge;
	}

	public void setpAge(String pAge) {
		this.pAge = pAge;
	}

	public String getpAddrs() {
		return pAddrs;
	}

	public void setpAddrs(String pAddrs) {
		this.pAddrs = pAddrs;
	}

	public String getConatctNumber() {
		return conatctNumber;
	}

	public void setConatctNumber(String conatctNumber) {
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
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance() {
		return distance;
	}
	
}
