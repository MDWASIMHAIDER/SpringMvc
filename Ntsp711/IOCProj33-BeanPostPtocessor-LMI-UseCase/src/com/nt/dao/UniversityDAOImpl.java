package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class UniversityDAOImpl implements UniversityDAO {
	
	public UniversityDAOImpl() {
		System.out.println("UniversityDAOImpl 0-praam constructor");
	}

	@Override
	public int insertStudentData(StudentBO bo) {
		System.out.println("Student bo  "+bo);
		return 1;
	}

	@Override
	public int insertEmployeeData(EmployeeBO bo) {
		System.out.println("Employee bo  "+bo);
		return 1;
	}

}
