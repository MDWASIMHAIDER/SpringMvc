package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDAO;

@Service("service")
public class StudentManagementServiceImpl implements StudentManagementService {

	@Autowired
	private StudentManagementService service;
	@Autowired
	StudentDAO dao;
	@Override
	public List<Map<String, Object>> findStudByLocation(String... loc) {
		List<Map<String,Object>>listdetail=null;
		String cond=null;
		StringBuffer sb=null;
		sb=new StringBuffer();
		sb.append("(");
		for(int i=0;i<loc.length;i++) {
			if(i==loc.length-1) {
			sb.append("'"+loc[i]+"'");
			}
			else {
				sb.append("'"+loc[i]+"',");
			}
		}
		sb.append(")");
		cond=sb.toString();
		System.out.println(cond);
		listdetail=dao.getStudByLocation(cond);
		if(listdetail!=null)
			System.out.println("not null");
		return listdetail;
	}

}
