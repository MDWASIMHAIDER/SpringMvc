package com.nt.service;

import java.util.List;

import com.nt.dto.PatientResultDTO;
import com.nt.dto.PatientSearchDTO;

public interface PatientService {
	public List<PatientResultDTO> getAllDetail(PatientSearchDTO dto);
}
