package com.nt.service;

import java.util.List;

import com.nt.dto.ScientistDTO;

public interface ScientistService {
	public List<ScientistDTO>fetchAllScientist();
	public String removeScientist(int id);
	public String editScientist(ScientistDTO dto);
	public ScientistDTO scientistById(int id);
	public String addScientist(ScientistDTO dto);
}
