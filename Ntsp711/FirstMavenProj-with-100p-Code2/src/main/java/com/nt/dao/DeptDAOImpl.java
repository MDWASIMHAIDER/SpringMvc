package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements DeptDAO {

	private static final  String GET_DEPT_COUNT="SELECT COUNT(*) FROM DEPT";
	private static final String GET_DEPT_COUNT_BY_NUMBER="SELECT  COUNT(*) FROM DEPT WHERE DLOC=?";
	private static final String GET_DEPT_ALL_DETAIL="SELECT DEPTNO,DNAME,DLOC FROM DEPT";
	private static final String GET_All_DEPT__BY_DEPTNAME="SELECT DEPTNO FROM DEPT WHERE DNAME=? ";
	private static final String REMOVE_RECORD_BY_LOC="DELETE FROM DEPT WHERE DLOC=?";	
	private static final String REMOVE_OLD_LOCATION_BY_NEW_LOC="UPDATE DEPT SET DLOC=? WHERE DLOC=?";
	
	
	@Autowired
	private JdbcTemplate jt;
	
	public int getDeptCount() {
		int count=0;
		count=jt.queryForObject(GET_DEPT_COUNT, Integer.class);
		return count;
	}

	public Map<String, Object> getDeptCountByNumber(String no) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> getDeptAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> getDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}

	public int removeDetailByLocation(String loc) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String removeLocationByNewLocation(String nloc, String oloc) {
		// TODO Auto-generated method stub
		return null;
	}

}
