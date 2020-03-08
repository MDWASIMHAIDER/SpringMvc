package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.ScientistBO;
import com.nt.dao.ScientistDAO;
import com.nt.dto.ScientistDTO;

@Service("service")
public class ScientistServiceImpl implements ScientistService {
	@Autowired
	private ScientistDAO dao;


	public List<ScientistDTO> fetchAllScientist() {
		List<ScientistDTO>listdto=new ArrayList();
		List<ScientistBO>listbo=null;
		listbo=dao.getAllScientist();
		listbo.forEach(bo->{
			ScientistDTO dto=new ScientistDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrno(listdto.size()+1);
			listdto.add(dto);
		});
		return listdto;
	}


	@Override
	public String removeScientist(int id) {
		int res=0;
		res=dao.deleteScientist(id);
		if(res==0) {
			return "Scientist Deletion Failed";
		}
		else {
			return "Scientist Deleted Succesfully";
		}
	}

	@Override
	public String editScientist(ScientistDTO dto) {
		int count=0;
		ScientistBO bo=null;
		bo=new ScientistBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.updateScientist(bo);
		if(count==0) {
			return "Record not Updated";
		}
		else {
			return "Record Updated Successfully";
		}
	}


	@Override
	public ScientistDTO scientistById(int id) {
		ScientistDTO dto=null;
		ScientistBO bo=null;
		dto=new ScientistDTO();
		bo=dao.getScientistById(id);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}


	@Override
	public String addScientist(ScientistDTO dto) {
		int count=0;
		ScientistBO bo=null;
		bo=new ScientistBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insertScientist(bo);
		if(count==0) {
			return "Scientist Insertion Failed";
		}
		else {
			return "Scientist Insertion Succeded";
		}
	}

}
