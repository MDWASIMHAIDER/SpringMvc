package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public interface StudentDAO {
	
	public List<Map<String,Object>> getStudByLocation(String dataCond);
	
}
