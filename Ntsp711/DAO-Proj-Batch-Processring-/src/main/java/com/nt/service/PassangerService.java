package com.nt.service;

import java.util.List;

import com.nt.dto.PassangerDTO;

public interface PassangerService {
	public String insertPassangerBatch(List<PassangerDTO>listdto);
}
