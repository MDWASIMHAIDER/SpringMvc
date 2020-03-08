package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PassangerBO;

@Repository("dao")
public class PassangerDAOImpl implements PassangerDAO {
	private static final String INSERT_BATCH_PASSANGER="INSERT INTO PASSANGER_RESERVATION VALUES(?,?,?,?)";
	@Autowired
	JdbcTemplate jt;
	public int[] insert(List<PassangerBO> listbo) {
		int[] result=null;
		result=jt.batchUpdate(INSERT_BATCH_PASSANGER, new MyBatchPreparedStatementSetter(listbo));
		return result;
	}
	private static class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter{
		private List<PassangerBO>listbo;
		public MyBatchPreparedStatementSetter(List<PassangerBO>listbo) {
			this.listbo=listbo;
		}
		public void setValues(PreparedStatement ps, int i) throws SQLException {
			PassangerBO bo=new PassangerBO();
			ps.setString(1,listbo.get(i).getName());
			ps.setString(2, listbo.get(i).getSource());
			ps.setString(3, listbo.get(i).getDest());
			ps.setInt(4, listbo.get(i).getPrice());
			
		}
		public int getBatchSize() {
			// TODO Auto-generated method stub
			return listbo.size();
		}
	}

}
