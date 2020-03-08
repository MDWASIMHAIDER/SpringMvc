package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String GET_EMP_BY_ID="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE_DETAIL WHERE EID=?";
	private static final String GET_EMPLOYEE_BY_DESG="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE_DETAIL WHERE DESG=?";
	private static final String UPDATE_EMLPOYEE_BY_DESG="UPDATE EMPLOYEE_DETAIL SET  DESG=? WHERE EID=?";
	private EmployeeSelector selector1;
	private EmployeeSelector2 selector2;
	private EmployeeSelector3 selector3;
	
	@Autowired
	public EmployeeDAOImpl(DataSource ds) {
		selector1=new EmployeeSelector(ds, GET_EMPLOYEE_BY_DESG);//1
		selector2=new EmployeeSelector2(ds, GET_EMP_BY_ID);
		selector3=new EmployeeSelector3(ds, UPDATE_EMLPOYEE_BY_DESG);
	}
	public List<EmployeeBO> getEmpByDesg(String desg) {
		List<EmployeeBO>listbo=null;
		listbo=selector1.execute(desg);//allready selector is representing one pre compiled query it xecute with pre com query
		//it get resultset obj having bunch of record selector class obj mapRow() method is called in loop  all number of records and 
		return listbo;//copy or added to all bo objs into listbo 
	}
	private static class EmployeeSelector extends MappingSqlQuery{
		public  EmployeeSelector(DataSource ds,String query) {//2nd
			super(ds,query);//super class called mappingsql get query and datasoursce
			super.declareParameter(new SqlParameter(Types.VARCHAR));//called declared param also gives query as precompiled sql query
			super.compile();//and one preapred statement obj is created param are reister with jdbc
		}
		@Override
		protected Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDAOImpl.EmployeeSelector.mapRow() ");
			EmployeeBO bo=null;
			bo=new EmployeeBO();
			bo.setEid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getFloat(4));
			return bo;
		}
		
	} //EmployeeSelctor1
	
	
	//2nd inneer class
	private static class EmployeeSelector2 extends MappingSqlQuery{
		
		public  EmployeeSelector2(DataSource ds,String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}
		@Override
		protected Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBO bo=null;
			bo=new EmployeeBO();
			bo.setEid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getFloat(4));
			return bo;
		}
		
	}

	@Override
	public EmployeeBO getEmpByEid(int eid) {
		EmployeeBO bo=null;
		bo=(EmployeeBO) selector2.findObject(eid);
		return bo;
	}
	
	
	private static class EmployeeSelector3 extends SqlUpdate{
		
		public  EmployeeSelector3(DataSource ds,String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter( Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}
		
	}
	
	@Override
	public int updateEmployee(int eid, String desg) {
		int count=0;
		count=selector3.update(desg,eid);
		return count;
	}

}
