package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PolicyBO;

@Repository("dao")
public class PolicyDAOImpl implements PolicyDAO {
	private static final String GET_POLICY_BY_ID="SELECT POLICYID,POLICYNAME,TENURE,COMPANY,INITIALAMOUNT FROM INSURANCE_DETAIL WHERE POLICYID=:POLICYID";
		@Autowired
		private NamedParameterJdbcTemplate jt;
		
	@Override
	public PolicyBO findPolicyById(int id) {
		Map<String,Object>param=new HashMap();
		param.put("POLICYID", id);
		PolicyBO bo=null;
		bo=jt.queryForObject(GET_POLICY_BY_ID, param, (rs,index)->{
			PolicyBO bo1=new PolicyBO();
			bo1.setPolicyId(rs.getInt(1));
			bo1.setPolicyName(rs.getString(2));
			bo1.setTenure(rs.getInt(3));
			bo1.setCompany(rs.getString(4));
			bo1.setInitialAmount(rs.getInt(5));
			return bo1;
		});
		return bo;
	}

}
