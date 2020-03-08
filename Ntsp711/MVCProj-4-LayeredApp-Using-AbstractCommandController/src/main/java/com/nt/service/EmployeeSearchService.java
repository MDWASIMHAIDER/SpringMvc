package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeSearchDTO;
import com.nt.dto.EmployeeSearchResultDTO;

public interface EmployeeSearchService {
	public List<EmployeeSearchResultDTO> process(EmployeeSearchDTO edto);
}
