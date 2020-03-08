package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PolicyBO;

@Repository("dao")
public class PolicyDAOImpl implements PolicyDAO {
	
	private static final String GET_POLICY_DETAIL="SELECT POLICYID,POLICYNAME,TENURE,COMPANY, INITIALAMOUNT FROM INSURANCE_DETAIL WHERE POLICYID=:POLICYID";
	private static final String INSERT_POLICY_DETAIL="INSERT INTO INSURANCE_DETAIL VALUES(:policyId,:policyName,:tenure,:company,:initialAmount)";
	private static final String GET_POLICY_BY_NAME="SELECT POLICYID,POLICYNAME,TENURE,COMPANY, INITIALAMOUNT FROM INSURANCE_DETAIL WHERE POLICYNAME IN(:name1,:name2,:name3)";
	@Autowired
	private NamedParameterJdbcTemplate jt;
	public PolicyBO getPolicyById(int id) {
		PolicyBO bo=null;
		Map<String,Object>params=null;
		params=new HashMap();
		params.put("POLICYID",id);
		System.out.println(jt.getClass().getName()+"=================");
		bo=jt.queryForObject(GET_POLICY_DETAIL,  params, (rs,index)->{
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
	@Override
	public int insertPolicy(PolicyBO bo) {
		int count=0;
		BeanPropertySqlParameterSource bpss=null;
		bpss=new BeanPropertySqlParameterSource(bo);
		count=jt.update(INSERT_POLICY_DETAIL,bpss);
		return count;
	}
	
	@Override
	public List<PolicyBO> getPolicyByName(String name1, String name2, String name3) {
		List<PolicyBO>listbo=null;
		MapSqlParameterSource params=null;
		params=new MapSqlParameterSource();
		params.addValue("name1", name1);
		params.addValue("name2", name2);
		params.addValue("name3", name3);
		listbo=jt.query(GET_POLICY_BY_NAME, params, rs->{
			List<PolicyBO>listbo1=new ArrayList();
			while(rs.next()) {
				PolicyBO bo=new PolicyBO();
				bo.setPolicyId(rs.getInt(1));
				bo.setPolicyName(rs.getString(2));
				bo.setTenure(rs.getInt(3));
				bo.setCompany(rs.getString(4));
				bo.setInitialAmount(rs.getInt(5));
				listbo1.add(bo);
			}
			return listbo1;
		});
		return listbo;
	}

}
