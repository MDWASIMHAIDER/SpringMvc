package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("service")
public class WishService {
	
	public String getTimeDetail() {
		Calendar calender=null;
		calender=Calendar.getInstance();
		int hour=0;
		hour=calender.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "Good Morning";
		}
		else if(hour<=15) {
			return "Good AftereNoon";
		}
		else if(hour<=20) {
			return "Good Evening";
		}
		else {
			return "Good Night";
		}
		
	}
}
