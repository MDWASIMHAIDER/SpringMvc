package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.PatientResultBO;
import com.nt.bo.PatientSearchBO;

public class PatientResultDAO  implements PatientSearchDAO{

	private static final String GET_PATIENT_RECORD="SELECT PID,PNAME,PDEPT,ADDRESS,TSTATUS,TBILL FROM MVC_PATIENT"
														+(" WHERE PID IS NOT NULL AND PID=?")
														+(" OR PNAME IS NOT NULL AND PNAME=?")
														+(" OR PDEPT IS NOT NULL AND PDEPT=?")
														+(" OR ADDRESS IS NOT NULL AND ADDRESS=?");
	private JdbcTemplate jt;

	public PatientResultDAO(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<PatientResultBO> getPatientRecord(PatientSearchBO bo) {
		List<PatientResultBO> listbo=null;
		listbo=jt.query(GET_PATIENT_RECORD, new MyRowMapper(),bo.getPid(),bo.getPname(),bo.getPdept(),bo.getAddress());
		return listbo;
	}
 public class MyRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		PatientResultBO bo=null;
		bo=new PatientResultBO();
		bo.setPid(rs.getInt(1));
		bo.setPname(rs.getString(2));
		bo.setPdept(rs.getString(3));
		bo.setAddress(rs.getString(4));
		bo.setTstatus(rs.getString(5));
		bo.setTbill(rs.getFloat(6));
		return bo;
	}
	 
 }
}
