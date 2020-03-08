package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	//bean property
	private String name;
	private Date date;
	public WishGenerator() {
		System.out.println("Constructor called");
	}//constructor
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//business logic
	public String generateWishMsg() {
		@SuppressWarnings("deprecation")
		int hour=date.getHours();
		@SuppressWarnings("deprecation")
		int time=date.getTimezoneOffset();
		if(hour<12) {
			return "good morning"+" "+name+" "+date;
		}
		else if(hour>12) {
			return "good afternoon"+" "+name+" "+date+time;
		}
		else if(hour>16) {
			return "good evening"+" "+name+" "+date;
		}
		else if(hour>16) {
			return "good night"+" "+name+" "+date;
		}
		else
			return "Sorry update your system time";
		
	}
}//class
