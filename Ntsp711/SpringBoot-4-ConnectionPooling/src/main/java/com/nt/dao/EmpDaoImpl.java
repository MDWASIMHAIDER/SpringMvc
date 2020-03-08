package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.nt.bo.EmployeeBO;

@Named("dao")
public class EmpDaoImpl implements EmpDao {

	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
//	private static final String GET_EMP_DETAILS_BY_DESG="SELECT * FROM EMP WHERE JOB=?"; 
	private static final String GET_EMP_DETAILS_BY_DESG="select empno,ename,job,salary from emp where job=?";
	@Resource//perform byname ,bytype autowire
	private JdbcTemplate jt;
	
	@Override
	public int getCount() {
			int count=0;
			count=jt.queryForObject(GET_EMP_COUNT, int.class);
		return count;
	}

	@Override
	public List<EmployeeBO> getEmpDetailByDesg(String desg) {
			List<EmployeeBO> listbo=null;
			listbo=new ArrayList<EmployeeBO>();
			jt.query(GET_EMP_DETAILS_BY_DESG, new EmpRowCallbackHandler(listbo),desg);
		return listbo;
	}
	private static class EmpRowCallbackHandler implements RowCallbackHandler{
		
		private List<EmployeeBO> listbo=null;
		public  EmpRowCallbackHandler(List<EmployeeBO> listbo) {
				this.listbo=listbo;
		}
		
		@Override
		public void processRow(ResultSet rs) throws SQLException {
				
				System.out.println("processRow()");
				EmployeeBO bo=null;
				//copy resultset obj record each record to bo
				bo=new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listbo.add(bo);
			
		}
		
	}

}
