package com.nt.bo;

public class CustomerBO {

	private int cno;
	private String cname;
	private float pamt,intramt;
	public CustomerBO() {
		System.out.println("bo 0-param constructor");
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getIntramt() {
		return intramt;
	}
	public void setIntramt(float intramt) {
		this.intramt = intramt;
	}

}
