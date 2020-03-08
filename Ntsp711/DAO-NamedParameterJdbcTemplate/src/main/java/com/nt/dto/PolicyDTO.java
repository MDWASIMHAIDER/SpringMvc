package com.nt.dto;

import lombok.Data;

@Data
public class PolicyDTO {
	private int policyId;
	private String policyName;
	private int tenure;
	private String company;
	private int initialAmount;
}
