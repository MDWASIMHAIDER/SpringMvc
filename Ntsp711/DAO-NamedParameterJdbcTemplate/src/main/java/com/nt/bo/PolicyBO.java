package com.nt.bo;

import lombok.Data;

@Data
public class PolicyBO {
	private int policyId;
	private String policyName;
	private int tenure;
	private String company;
	private int initialAmount;
}
