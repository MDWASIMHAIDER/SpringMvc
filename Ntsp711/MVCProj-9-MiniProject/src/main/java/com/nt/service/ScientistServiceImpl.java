package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.ScientistBO;
import com.nt.dao.ScientistDAIOImpl;
import com.nt.dto.ScientistDTO;

public class ScientistServiceImpl implements ScientistService {
	private ScientistDAIOImpl dao;
	
	public ScientistServiceImpl(ScientistDAIOImpl dao) {
		this.dao = dao;
	}

	public List<ScientistDTO> fetchAllScientist() {
	
		List<ScientistDTO>listdto=new ArrayList();
		List<ScientistBO>listbo=null;
		listbo=dao.getAllScientist();
		listbo.forEach(bo->{
			ScientistDTO	sdto=new ScientistDTO();
			sdto.setSno(bo.getSno());
			sdto.setSname(bo.getSname());
			sdto.setDomain(bo.getDomain());
			sdto.setExperiance(bo.getExperiance());
			sdto.setPatantCounts(bo.getPatantCounts());
			listdto.add(sdto);
		});
		return listdto;
	}
@Override
public String setScientist(ScientistDTO dto) {
	ScientistBO bo=null;
	bo=new ScientistBO();
	bo.setSno(dto.getSno());
	bo.setSname(dto.getSname());
	bo.setDomain(dto.getDomain());
	bo.setExperiance(dto.getExperiance());
	bo.setPatantCounts(dto.getPatantCounts());
	int res=dao.addScientist(bo);
	List<ScientistBO>listbo=null;
	listbo=dao.getAllScientist();
	if(res==0) {
		return "Operation Failed";
	}
	else
	return "Operation Succeded";
}

@Override
public ScientistDTO getScientistById(int id) {
	ScientistBO bo=null;
	ScientistDTO dto=null;
//use DAO
	bo=dao.getScientist(id);
	//convert  bo to DTO
	dto=new ScientistDTO();
	BeanUtils.copyProperties(bo,dto);
	return dto;
}
}
