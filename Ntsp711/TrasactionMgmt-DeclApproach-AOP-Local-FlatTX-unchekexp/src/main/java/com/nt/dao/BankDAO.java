package com.nt.dao;

public interface BankDAO {
	public int withdraw(int amt,int acNo);
	public int deposite(int acNo,int amt);
}
