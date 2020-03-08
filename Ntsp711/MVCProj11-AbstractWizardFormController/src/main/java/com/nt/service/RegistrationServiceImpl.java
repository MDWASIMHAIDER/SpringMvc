package com.nt.service;

import javax.imageio.spi.RegisterableService;
import javax.imageio.spi.ServiceRegistry;

import org.springframework.beans.BeanUtils;

import com.nt.bo.RegistrationBO;
import com.nt.dao.RegistrationDAO;
import com.nt.dto.RegistrationDTO;

public class RegistrationServiceImpl implements RegistrationService{

	private RegistrationDAO dao;
	
	public RegistrationServiceImpl(RegistrationDAO dao) {
		this.dao = dao;
	}

	public String registration(RegistrationDTO dto) {
		RegistrationBO bo=null;
		bo=new RegistrationBO();
		int count=0;
		BeanUtils.copyProperties(dto, bo);
		count=dao.registerCustomer(bo);
		if(count==0)
			return "registration falied";
		else
			return "registraion succeeded";
	}

}
