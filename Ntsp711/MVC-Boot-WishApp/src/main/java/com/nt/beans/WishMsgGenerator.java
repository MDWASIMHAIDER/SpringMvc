package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMsgGenerator {
	@Autowired
	Calendar calendar;
	
	public String generateMessage() {
		int hour=0;
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "good morning";
		}
		else if(hour<16) {
			return "good afternoon";
		}
		else if(hour<20) {
			return "good evening";
		}
		else {
			return "good night";
		}

	}
}
