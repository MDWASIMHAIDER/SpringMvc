package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeSearchBO;


@Repository("dao")
public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
	
	private static final String GET_EMP_QUERY=" SELECT ENO,ENAME,DESG,SALARY,DEPTNO,MGRNO FROM MVC_LAYERED_EMPLOYEE";
	private static final String SET_EMP_QUERY="INSERT INTO MVC_LAYERED_EMPLOYEE VALUES(mvc_seq.nextval,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	@Override
	public List<EmployeeSearchBO> searchEMp() {
		List<EmployeeSearchBO>listbo=null;
		BeanPropertyRowMapper<EmployeeSearchBO>rowMapper=null;
		rowMapper=new BeanPropertyRowMapper(EmployeeSearchBO.class);
		listbo=jt.query(GET_EMP_QUERY,new RowMapperResultSetExtractor<EmployeeSearchBO>(rowMapper));
		return listbo;
	}

	@Override
	public int insertEmp(EmployeeSearchBO bo) {
		int count=0;
		count=jt.update(SET_EMP_QUERY, bo.getEname(),bo.getDesg(),bo.getSalary(),bo.getDeptno(),bo.getMgrno());
		return count;
	}

}