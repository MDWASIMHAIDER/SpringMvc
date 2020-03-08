package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalanderFactoryBean implements FactoryBean<Calendar> {

	private int year;
	private int month;
	private int date;
	
	public CalanderFactoryBean(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public Calendar getObject() throws Exception {
	//	System.out.println("Calanderfactory getObject");
		Calendar cal=null;
		cal=Calendar.getInstance();
		cal.set(year, month, date);
		return cal;
	}

	@Override
	public Class<?> getObjectType() {
	//	System.out.println("CalanderFactoryBean.getObjectType()");
		return Calendar.class;
	}
@Override
public boolean isSingleton() {
	System.out.println("CalanderFactoryBean.isSingleton()");
	return true;
	
}

}
