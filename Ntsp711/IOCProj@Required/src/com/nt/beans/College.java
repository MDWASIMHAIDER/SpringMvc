package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class College {
	private int id;
	private String type;
	public void setId(int id) {
		this.id=id;
		System.out.println(id);
	}
	@Required
 public void setType(String type) {
	 this.type=type;
	 System.out.println("college test()"+type);
 }
	@Override
	public String toString() {
		return "College [id=" + id + ", type=" + type + "]";
	}
	
}
