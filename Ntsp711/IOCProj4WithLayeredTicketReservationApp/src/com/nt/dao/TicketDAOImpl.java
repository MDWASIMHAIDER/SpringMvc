package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.TicketBO;

public class TicketDAOImpl implements TicketDAO {
	private static final String INSERT_QUERY_TICKET="INSERT INTO TICKET_RESERVATION VALUES (TICKET_SEQ_NO.NEXTVAL,?,?,?,?,?,?,?,?)";
	DataSource ds=null;
	public TicketDAOImpl(DataSource ds) {
		this.ds=ds;
		System.out.println("TicketDAOImpl.-0 param constructor");
	}

	@Override
	public int generateTicket(TicketBO bo) throws Exception {
			Connection con=null;
			PreparedStatement ps=null;
			int count=0;
			con=ds.getConnection();
			if(con!=null)
				System.out.println(" sql connected");
		//	float amount=0.0f;
			ps=con.prepareStatement(INSERT_QUERY_TICKET);
			if(ps!=null)
				System.out.println("statement prepared");
			ps.setString(1, bo.getpName());
			ps.setFloat(2, bo.getpAge());
			ps.setString(3,bo.getpAddrs());
			ps.setLong(4, bo.getConatctNumber());
			ps.setString(5, bo.getGender());
			ps.setString(6, bo.getSourceStation());
			ps.setString(7, bo.getDestStation());
			ps.setFloat(8, bo.getDistance());
			//ps.setFloat(9, bo.setAmount(amount));
			count=ps.executeUpdate();
		
				return count;
			
		
	}

}
