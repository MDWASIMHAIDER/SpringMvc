package com.nt.service;

import java.util.List;
import java.util.Map;

public interface StudentManagementService {
	public List<Map<String,Object>>findStudByLocation(String... loc);
}
