package com.nt.service;

import com.nt.bo.TicketBO;
import com.nt.dao.TicketDAOImpl;
import com.nt.dto.TicketDTO;
import com.nt.service.TicketService;

public class TicketServiceImpl implements TicketService {
	TicketDAOImpl dao=null;
	public TicketServiceImpl(TicketDAOImpl dao) {
		this.dao=dao;
	}

	@Override
	public String TicketReservation(TicketDTO dto)throws Exception {
		TicketBO bo=null;
		int count=0;
		bo=new TicketBO();
		bo.setpName(dto.getpName());
		bo.setGender(dto.getGender());
		bo.setpAge(dto.getpAge());
		bo.setConatctNumber(dto.getConatctNumber());
		bo.setSourceStation(dto.getSourceStation());
		bo.setDestStation(dto.getDestStation());
		bo.setpAddrs(dto.getpAddrs());
		bo.setDistance(dto.getDistance());
		count=dao.generateTicket(bo);
		if(count==1)
			return "Your Resrvation is confirmed";
		else
			return "Your Resrvation is not confirmed";
		
	}

}
