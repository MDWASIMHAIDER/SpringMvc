package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PolicyBO;
import com.nt.dao.PolicyDAO;
import com.nt.dto.PolicyDTO;

@Service("service")
public class PolicyServiceImpl implements PolicyService {
	@Autowired
	private PolicyDAO dao;
	@Override
	public PolicyDTO findPolcyByNumber(int num) {
		PolicyBO bo=null;
		PolicyDTO dto=new PolicyDTO();
		bo=dao.findPolicyById(num);
		BeanUtils.copyProperties(bo, dto);
		
		return dto;
	}

}
