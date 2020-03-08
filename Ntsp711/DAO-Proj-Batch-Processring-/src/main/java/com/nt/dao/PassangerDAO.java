package com.nt.dao;

import java.util.List;

import com.nt.bo.PassengerBO;

public interface PassangerDAO {
	public int[] insert(List<PassengerBO>listbo);
}
