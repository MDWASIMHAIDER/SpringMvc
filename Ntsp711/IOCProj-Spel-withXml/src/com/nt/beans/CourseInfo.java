package com.nt.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CourseInfo {
		private String domain;
		private String institution;
		private List<String>course;
		private String[] faculty;
		private Map<String,Integer>price;
		private int discount;
		private Map<String,Integer> courseDuration;
}
