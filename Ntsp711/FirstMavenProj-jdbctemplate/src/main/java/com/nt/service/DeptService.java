package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DeptService {
	
	public int getCount();
	public Map<String,Object> getDetailsByNumber(String no);
	public List<Map<String,Object>> getAllDetails();
	public List getAllDeptNumber(String name);
	public int removeDeptRecordByLocation(String loc);
	public String removeOldLocByNewLoc(String nloc,String oloc);
	public int insertRecordIntoTable(String dname,String dloc);
}
