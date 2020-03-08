package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository("dao")
public interface EmployeeDetailRepository extends CrudRepository<Employee_Detail, Long> {
	
		public List<Employee_Detail> findByEname(String name);//ename is propety name
	
}
