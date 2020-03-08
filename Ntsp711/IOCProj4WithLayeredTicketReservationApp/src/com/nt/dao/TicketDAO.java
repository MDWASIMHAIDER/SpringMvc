package com.nt.dao;

import com.nt.bo.TicketBO;

public interface TicketDAO {
	
	public int generateTicket(TicketBO bo)throws Exception;
}
