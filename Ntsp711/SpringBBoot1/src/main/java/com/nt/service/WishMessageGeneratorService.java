package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Component("wish")//both are same
@Service("wish")//both work same
public class WishMessageGeneratorService {
	public String generateWishMessage(String name) {
		Calendar calendar=null;
		int hour=0;
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "Good Morning "+name; 
		}
		else if( hour>=12 && hour<=16 ) {
			return "Good AfterNoon "+name;
		}
		else if(hour<=20) {
			return "Good Evening "+name;
		}
		else {
			return "Good Night";
		}
		
	}
	
	
			
}
