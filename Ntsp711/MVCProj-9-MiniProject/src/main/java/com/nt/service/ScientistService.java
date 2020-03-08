package com.nt.service;

import java.util.List;

import com.nt.dto.ScientistDTO;

public interface ScientistService {
	public List<ScientistDTO> fetchAllScientist();
	public String setScientist(ScientistDTO dto);
	public ScientistDTO getScientistById(int id);
}
