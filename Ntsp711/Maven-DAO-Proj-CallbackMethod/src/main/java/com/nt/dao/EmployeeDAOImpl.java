package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empRepo")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jt;
	private static final String GET_EMP_BY_NO="SELECT ENO, ENAME,EADD,SALARY FROM EMPLOYEE_NUMBER WHERE ENO=?";
	private static final String GET_EMP_BY_DESG="SELECT ENO,ENAME,EADD,SALARY FROM EMPLOYEE_NUMBER WHERE EADD=? ";
	
	//row mapper using lambda expression
	@Override
	public EmployeeBO findEmpByNo(int no) {
		EmployeeBO bo=null;
			bo=jt.queryForObject(GET_EMP_BY_NO, (rs,rowNum)->{
			EmployeeBO bo1=null;
			bo1=new EmployeeBO();
			bo1.setEno(rs.getInt(1));
			bo1.setEname(rs.getString(2));
			bo1.setAdd(rs.getString(3));
			bo1.setSalary(rs.getInt(4));
			return bo1;
		}, no);
		return bo;
	}
	//row mapper using callback interface
	/*public EmployeeBO findEmpByNo(int no) {
				EmployeeBO bo=null;
				bo=jt.queryForObject(GET_EMP_BY_NO, new MyRowMapper(), no);
				
		return bo;
	}
	public static class MyRowMapper implements RowMapper<EmployeeBO>{
		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBO bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setAdd(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		}
			
	}
	*/
	
//2nd way to inplace of ResultSetExtracter work same but no need to iterate copy properties explicitly it does all automatically
/*	public List<EmployeeBO> findEmpByAddress(String desg) {
		List<EmployeeBO> listbo=null;
		BeanPropertyRowMapper<EmployeeBO>mapper=null;
		mapper=new BeanPropertyRowMapper(EmployeeBO.class);
		listbo= jt.query(GET_EMP_BY_DESG, mapper, desg);
		return listbo;
	}//findempbydesg
	*/
	

	//using resultset extracter
	/*public List<EmployeeBO> findEmpByAddress(String desg) {
		List<EmployeeBO> listbo=null;
		listbo= jt.query(GET_EMP_BY_DESG, new MyResultSetExtracter(), desg);
		return listbo;
	}//findempbydesg
	
	public static class MyResultSetExtracter implements ResultSetExtractor<List<EmployeeBO>>{

		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				EmployeeBO bo=null;
				List<EmployeeBO>listbo=null;
				listbo=new ArrayList();
				while(rs.next()) {
					bo=new EmployeeBO();
					bo.setEno(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setAdd(rs.getString(3));
					bo.setSalary(rs.getInt(4));
					listbo.add(bo);
				}//while
			return listbo;
		}//extract data
		
	}//myresultsetextrcater
*/
	
	//using lambda exp
	/*public List<EmployeeBO> findEmpByAddress(String desg) {
		List<EmployeeBO> listbo=null;
		List<EmployeeBO>listbo1=new ArrayList();
		listbo= jt.query(GET_EMP_BY_DESG,
				rs->{
			
			EmployeeBO bo=null;
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setAdd(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listbo1.add(bo);
			}
			return listbo1;
		}, desg);
		
		return listbo;
	}//find by address lambda exp
	*/
	
	//row callback handler using lambda exp
	public List<EmployeeBO>findEmpByAddress(String desg){
		List<EmployeeBO>listbo=new ArrayList();
		jt.query(GET_EMP_BY_DESG, rs->{
			EmployeeBO bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setAdd(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			listbo.add(bo);
		}, desg);
		return listbo;
	}
	
	
	/*
	//row callback handler
	public List<EmployeeBO>findEmpByAddress(String desg){
		List<EmployeeBO>listbo=null;
		listbo=new ArrayList();
		jt.query(GET_EMP_BY_DESG, new MyRowCallBackHandler(listbo), desg);
		return listbo;
	}
	public static class MyRowCallBackHandler implements RowCallbackHandler{
		List<EmployeeBO>listbo;
		public MyRowCallBackHandler(List<EmployeeBO>listbo) {
			this.listbo=listbo;
		}
		@Override
		public void processRow(ResultSet rs) throws SQLException {
			EmployeeBO bo=null;
			 bo=new EmployeeBO();
			 bo.setEno(rs.getInt(1));
			 bo.setEname(rs.getString(2));
			 bo.setAdd(rs.getString(3));
			 bo.setSalary(rs.getInt(4));
			 listbo.add(bo);
			
		}
		
	}
*/	
}//class
