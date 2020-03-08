package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassangerBO;
import com.nt.dao.PassangerDAO;
import com.nt.dto.PassangerDTO;

@Service("service")
public class PassangerServiceImpl implements PassangerService{
	@Autowired
	PassangerDAO dao;
	public String insertBatchPassanger(List<PassangerDTO> listdto) {
		int [] result=null;
		 final List<PassangerBO>listbo=new ArrayList();
		listdto.forEach(dto->{
			PassangerBO bo=new PassangerBO();
			BeanUtils.copyProperties(dto, bo);
			listbo.add(bo);
		});
     result=dao.insert(listbo);
     if(result!=null) {
    	 return "Rescord inserted successfully";
     }
     else {
    	 return "rescord not inserted ";
     }
	}
	
}
