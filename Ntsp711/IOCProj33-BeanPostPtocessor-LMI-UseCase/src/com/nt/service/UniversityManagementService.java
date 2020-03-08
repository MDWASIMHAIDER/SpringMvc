package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.UniversityDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class UniversityManagementService {
		private UniversityDAO  dao;
		public UniversityManagementService(UniversityDAO dao) {
			this.dao=dao;
		}
		public abstract StudentBO createStudentBO();
		public abstract EmployeeBO createEmployeeBO();
		public   String  registerStudent(StudentDTO dto) {
			StudentBO bo=null;
			int count=0;
			bo=createStudentBO();
			BeanUtils.copyProperties(dto,bo);
			count=dao.insertStudentData(bo);
			if(count==0) {
				return "Student registration failed";
			}
			else {
				return "student registration successeded";
			}
			
		}
		public String registerEmployee(EmployeeDTO dto) {
			EmployeeBO bo=null;
			int count=0;
			bo=createEmployeeBO();
			BeanUtils.copyProperties(dto, bo);
			count=dao.insertEmployeeData(bo);
			if(count==0) {
				return "Employee registration failed";
			}
			else {
				return "Employee registration succeseded";
			}
		}
}
