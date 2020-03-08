package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.LoginBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.LoginDTO;

@Service("service")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;
	@Override
	public String validateUser(LoginDTO dto) {
		int count=0;
		LoginBO bo=null;
		bo=new LoginBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.authenticate(bo);
		if(count==0) {
			return "User Not Authorized";
		}
		else {
			return "User Authorized";
		}
		}

}
