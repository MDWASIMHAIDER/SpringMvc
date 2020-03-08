package com.nt.beans;

import java.util.Calendar;

public class ScheduleReminder {

	private Calendar cal;
	public ScheduleReminder(Calendar cal) {
		this.cal=cal;
	}
	public String reminderOfTheDay() {
		System.out.println("dateee ==>"+cal);
		Calendar sysdate=null;
		sysdate=Calendar.getInstance();
		if((cal.get(Calendar.MONTH)==sysdate.get(Calendar.MONTH)+1) && cal.get(Calendar.DATE)==sysdate.get(cal.get(Calendar.DATE))) {
			return "today is your birthday";
		}
		else {
			return "sry today is not your birthday";
		}
		
	}

}
