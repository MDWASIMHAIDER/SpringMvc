package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DeptDAO;
import com.nt.dao.DeptDAOImpl;


@Service("service")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDAO dao;
	
	public int getCount() {
		int count=0;
		count=dao.getDeptCount();
		return count;
	}

	public Map<String, Object> getDetailsByNumber(String no) {
		Map<String,Object> mcount=null;
		mcount=dao.getDeptCountByNumber(no);
		return mcount;
	}

	public List<Map<String, Object>> getAllDetails() {
		List<Map<String,Object>> listAllDetail=null;
		listAllDetail=dao.getDeptAllDetails();
		return listAllDetail;
	}

	public List getAllDeptNumber(String name) {
		List ldetail=null;
		ldetail=dao.getDept(name);
		return ldetail;
	}

	public int removeDeptRecordByLocation(String loc) {
		int count=0;
		count=dao.removeDetailByLocation(loc);
		return count;
	}

	public String removeOldLocByNewLoc(String nloc, String oloc) {
		String detail;
		detail=dao.removeLocationByNewLocation(nloc, oloc);
		return detail;
	}

}
