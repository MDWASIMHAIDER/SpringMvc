package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ScientistDTO implements Serializable {
	private int sno;
	private String sname;
	private String domain;
	private int experiance;
	private int patantCounts;
}
