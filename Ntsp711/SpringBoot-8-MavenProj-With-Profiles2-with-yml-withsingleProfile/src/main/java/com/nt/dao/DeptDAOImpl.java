package com.nt.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

@Repository("dao")
public class DeptDAOImpl  implements DeptDAO{
		
	private static final  String GET_DEPT_COUNT="SELECT COUNT(*) FROM DEPT";
	private static final String GET_DEPT_COUNT_BY_NUMBER="SELECT  COUNT(*) FROM DEPT WHERE DLOC=?";
	private static final String GET_DEPT_ALL_DETAIL="SELECT DEPTNO,DNAME,DLOC FROM DEPT";
	private static final String GET_All_DEPT__BY_DEPTNAME="SELECT DEPTNO FROM DEPT WHERE DNAME=? ";
	private static final String REMOVE_RECORD_BY_LOC="DELETE FROM DEPT WHERE DLOC=?";	
	private static final String REMOVE_OLD_LOCATION_BY_NEW_LOC="UPDATE DEPT SET DLOC=? WHERE DLOC=?";
	
	@Autowired
	private  JdbcTemplate jt;

	public int getDeptCount() {
		int count=0;
		count=jt.queryForObject(GET_DEPT_COUNT, Integer.class);
		return count;
	}

	public Map<String, Object> getDeptCountByNumber(String no) {
		Map<String,Object> mcount=null;
		mcount=jt.queryForMap(GET_DEPT_COUNT_BY_NUMBER, no);
		return mcount;
	}

	public List<Map<String, Object>> getDeptAllDetails() {
		List<Map<String,Object>> listAllDetail=null;
		listAllDetail=jt.queryForList(GET_DEPT_ALL_DETAIL);
		return listAllDetail;
	}

	public List<Map<String,Object>> getDept(String dept) {
		List<Map<String,Object>> listdeptno=null;
		listdeptno=jt.queryForList(GET_All_DEPT__BY_DEPTNAME,dept);
		return listdeptno;
	}

	public int removeDetailByLocation(String loc) {
		int count=0;
		count=jt.update(REMOVE_RECORD_BY_LOC, loc);
		return count;
	}

	public String removeLocationByNewLocation(String nloc, String oloc) {
		int count=0;
		count=jt.update(REMOVE_OLD_LOCATION_BY_NEW_LOC, oloc,nloc);
		if(count!=0) {
			return "Record Updated Successfully";
		}
		else {
			return "Record not Updated Successfully";
		}
	}

	 
	
}
