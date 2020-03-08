package com.nt.dao;

import java.util.List;

import com.nt.bo.PassangerBO;

public interface PassangerDAO {
	public int[] insert(List<PassangerBO>listbo);
}
