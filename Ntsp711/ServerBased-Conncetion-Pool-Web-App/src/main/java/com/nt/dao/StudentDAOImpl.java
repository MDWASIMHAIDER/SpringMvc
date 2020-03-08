package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studDAO")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private  JdbcTemplate jt;
	
	
	@Override
	public List<Map<String, Object>> getStudByLocation(String dataCond) {
		String QUERY_FROM_LOCATION="SELECT SNO,SNAME,SADD FROM STUDENT_LOCATION WHERE SADD IN "+dataCond;
		System.out.println(QUERY_FROM_LOCATION);
		List<Map<String,Object>>listStud=null;
		listStud=jt.queryForList(QUERY_FROM_LOCATION);
		return listStud;
	}


}
