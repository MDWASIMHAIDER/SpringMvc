package com.nt.dao;

import java.util.List;

import com.nt.bo.PatientResultBO;
import com.nt.bo.PatientSearchBO;

public interface PatientSearchDAO {
	public List<PatientResultBO> getPatientRecord(PatientSearchBO bo);
}
