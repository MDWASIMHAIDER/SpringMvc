package com.nt.bo;

import java.util.Date;

public abstract class BaseBO {
	private String name;
	private String address;
	private String email;
	private long mobile;
	private Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBO [name=" + name + ", address=" + address + ", email=" + email + ", mobile=" + mobile + ", doj="
				+ doj + "]";
	}
}
