package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.LoginBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.LoginDTO;

@Service("service")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true,transactionManager="DsTx")
	public String LoginAuthentication(LoginDTO dto) {
		int count=0;
		String resMsg=null;
		LoginBO bo=null;
		bo=new LoginBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.authenticate(bo);
		if(count==0) {
			return "User Unauthorised";
		}
		else {
			return "User Authenticated";
		}
	}

}
