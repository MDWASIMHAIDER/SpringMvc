package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private String name;
	private Date date;
	public WishMessageGenerator(Date date,String name) {
		this.date=date;
		this.name=name;
	}//constructor
	@Override
	public String toString() {
		return name+" "+date;
	}
	public String generateMessage() {
		int hour=0;
		hour=date.getHours();
		if(hour<12) {
			return "good mornig "+name+" "+date;
		}
		else if(hour>12) {
			return "good afternoon "+name+" "+date;
		}
		else if(hour>16) {
			return "good evening "+name+" "+date;
		}
		else if(hour>20) {
			return "good night "+name+" "+date;
		}
		else
			return "good mornig "+name+" "+date;
	}
}//class
