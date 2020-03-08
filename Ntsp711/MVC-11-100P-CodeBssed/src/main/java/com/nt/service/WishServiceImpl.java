package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("service")
public class WishServiceImpl implements WishService {

	@Override
	public String WishGenerate() {
		System.out.println("Wish Service");
		Calendar calendar=null;
		int hour=0;
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "Good Morning";
		}
		else if(hour<16) {
			return "Good AfterNoon";
		}
		else if(hour<20) {
			return "Good Evening";
		}
		else  {
			return "Good Night";
		}
	}

}
