package com.nt.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data 
public class StudentInfo {
		private int regNo;
		private String sName;
		private List<String> availedCourse;
		private String[] availedFaculty;
		private Map<String,Integer> availedCoursesDuration;
		private int courseFeeTotal;
		private int courseDurationTotal;
		private int finalFee;
		private Date date;
		
}
