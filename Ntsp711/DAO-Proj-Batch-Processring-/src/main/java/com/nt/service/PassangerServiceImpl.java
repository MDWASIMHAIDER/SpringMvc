package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassengerBO;
import com.nt.dao.PassangerDAO;
import com.nt.dto.PassangerDTO;

@Service("service")
public class PassangerServiceImpl implements PassangerService {
	@Autowired
	PassangerDAO dao;
	public String insertPassangerBatch(List<PassangerDTO> listdto) {
		int[] result=null;
		List<PassengerBO>listbo=new ArrayList();
		listdto.forEach(pas->{
			PassengerBO bo=new PassengerBO();
			BeanUtils.copyProperties( pas,bo);
			listbo.add(bo);
		});
		result=dao.insert(listbo);
		if(result!=null) {
			return "insertion successful";
		}
		else
			return "insertion failed";
			}

}
