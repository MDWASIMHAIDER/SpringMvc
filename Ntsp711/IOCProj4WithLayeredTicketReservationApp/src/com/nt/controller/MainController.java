package com.nt.controller;

import com.nt.dto.TicketDTO;
import com.nt.service.TicketServiceImpl;
import com.nt.vo.TicketVO;

public class MainController {
	TicketServiceImpl service;
	public MainController(TicketServiceImpl service) {
		this.service=service;
		System.out.println("MainController-0 param constructor");
	}
	public String processTicket(TicketVO vo) throws Exception{
		
		TicketDTO dto=null;
		String res=null;
		dto=new TicketDTO();
		dto.setpName(vo.getpName());
		dto.setGender(vo.getGender());
		dto.setConatctNumber(Long.parseLong(vo.getConatctNumber()));
		dto.setpAge(Float.parseFloat(vo.getpAge()));
		dto.setSourceStation(vo.getSourceStation());
		dto.setDestStation(vo.getDestStation());
		dto.setDistance(Integer.parseInt(vo.getDistance()));
		dto.setpAddrs(vo.getpAddrs());
		res=service.TicketReservation(dto);
		
		return res;
	}
	

}
