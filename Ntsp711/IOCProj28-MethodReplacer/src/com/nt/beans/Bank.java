package com.nt.beans;

public class Bank {

	public Bank() {
		System.out.println("bank 0-param constructor");
	}
	public float calcIntrAmt(float pamt,float time) {
		System.out.println("Bank.calcIntrAmt()");
		return pamt*time*0.2f/100;
	}
	public String test(String s) {
		System.out.println("tst ");
		return s;
	}
	

}
