package com.nt.bo;

public class CustomerBO {

	private int cno;
	private String cname;
	private float pamt,intrestamount;
	public CustomerBO() {
		System.out.println("BO  0-param constructor");
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
	public float getIntrestamount() {
		return intrestamount;
	}
	public void setIntrestamount(float intrestamount) {
		this.intrestamount = intrestamount;
	}

}
