package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dto.PolicyDTO;



public interface PolicyService {	
	public PolicyDTO getPolicyByNum(int id);
	public String PolicyInsert(PolicyDTO dto);
	public List<PolicyDTO>findPolicyByName(String name1,String name2,String name3 );
}
