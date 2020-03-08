package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DeptDAO {
	public int getDeptCount();
	public Map<String,Object> getDeptCountByNumber(String no);
	public List<Map<String,Object>> getDeptAllDetails();
	public List<Map<String,Object>> getDept(String dept);
	public int removeDetailByLocation(String loc);
	public String removeLocationByNewLocation(String nloc,String oloc);
}
