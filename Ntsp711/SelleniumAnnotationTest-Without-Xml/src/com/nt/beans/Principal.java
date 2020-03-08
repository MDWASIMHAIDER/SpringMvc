package com.nt.beans;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	Teacher teach;
	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	public void principanInfo() {
		System.out.println("my name is wasim n im your peincipal");
	}
}
