package com.nt.dao;

import java.util.List;
import java.util.Map;

import com.nt.bo.PolicyBO;

public interface PolicyDAO {
	public PolicyBO getPolicyById(int id);
	public int insertPolicy(PolicyBO bo);
	public List<PolicyBO> getPolicyByName(String name1,String name2,String name3);
}
