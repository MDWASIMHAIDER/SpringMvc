package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("repo")
public class EMployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SimpleJdbcInsert sji;
	/*public int insertEmp(EmployeeBO bo) {
		Map<String,Object>map=new HashMap();
		int count=0;
		map.put("eid", bo.getEid());
		map.put("ename", bo.getEname());
		map.put("desg", bo.getDesg());
		map.put("salary", bo.getSalary());
		sji.setTableName("employee_detail");
		count=sji.execute(map);
		return count;
	}
*/
	
	//both approach will work same
	public int insertEmp(EmployeeBO bo) {
		int count=0;
		BeanPropertySqlParameterSource source=null;
				source=new BeanPropertySqlParameterSource(bo);
		sji.setTableName("employee_detail");
		count=sji.execute(source);
		return count;
	}
}
