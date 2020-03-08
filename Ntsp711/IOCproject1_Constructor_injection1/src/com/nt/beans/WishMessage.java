package com.nt.beans;

import java.util.Date;

public class WishMessage {
	private String name;
	private Date date;
	public WishMessage(String name,Date date) {
		System.out.println("wish constructor");
		this.date=date;
		this.name=name;
	}
	@Override
	public String toString() {
		return name+"  "+date;
	}
	public String messageGenetrate() {
		int hour=0;
		if(hour<12) {
			return "good morning "+name+" "+date;
		}
		if(hour>12) {
			return "good afternoon "+name+" "+date;
		}
		if(hour>16) {
			return "good evening "+name+" "+date;
		}
		if(hour<19) {
			return "good night "+name+" "+date;
		}
		else
			return "please set time of your system";
	}
	

}
