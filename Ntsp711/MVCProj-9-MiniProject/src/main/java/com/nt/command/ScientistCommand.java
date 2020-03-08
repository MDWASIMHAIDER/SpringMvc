package com.nt.command;

import lombok.Data;


public class ScientistCommand {
	
	private int sno;
	private String sname;
	private String domain;
	private int experiance;
	private int patantCounts;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public int getPatantCounts() {
		return patantCounts;
	}
	public void setPatantCounts(int patantCounts) {
		this.patantCounts = patantCounts;
	}
	
}
