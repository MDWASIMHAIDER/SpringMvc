package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PassengerBO;
@Repository("dao")
public class PassangerDAOImpl implements PassangerDAO {
	private static final String QUERY_FOR_BATCH="INSERT INTO PASSANGER_RESERVATION VALUES(?,?,?,?)";
	@Autowired
	JdbcTemplate jt;
	public int[] insert(List<PassengerBO> listbo) {
		int result[]=null;
		result=jt.batchUpdate(QUERY_FOR_BATCH, new PassangerBatchPreparedStetementSetter(listbo));
		return result;
	}
	
	private static class PassangerBatchPreparedStetementSetter implements BatchPreparedStatementSetter{
		List<PassengerBO>listbo;
		public PassangerBatchPreparedStetementSetter(List<PassengerBO> listbo) {
			this.listbo=listbo;
		}

		public void setValues(PreparedStatement ps, int i) throws SQLException {
			ps.setString(1, listbo.get(i).getName());
			ps.setString(2, listbo.get(i).getSource());
			ps.setString(3, listbo.get(i).getDest());
			ps.setInt(4, listbo.get(i).getPrice());
		}

		public int getBatchSize() {
			
			return listbo.size();
		}
		
		
	}

}
