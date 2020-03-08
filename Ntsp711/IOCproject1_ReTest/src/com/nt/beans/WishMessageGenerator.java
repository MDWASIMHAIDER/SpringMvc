package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	String name;
	Date date;
	public WishMessageGenerator() {
		System.out.println("Wish message constructor called");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String messageGenerator() {
		int hour=date.getHours();
		if(hour<12) {
			return "Good Morning "+name+" "+date;
		}
		if(hour>12) {
			return "Good AfterNoon "+name+" "+date;
		}
		if(hour>15) {
			return "Good Evening "+name+" "+date;
		}
		if(hour>17) {
			return "Good Night "+name+" "+date;
		}
		else 
			return "Sorry plz change your System Date";
	}

	
	
}
